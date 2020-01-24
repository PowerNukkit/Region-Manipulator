package br.com.gamemods.regionmanipulator

import kotlin.math.floor

/**
 * A region file stores a group of 32 x 32 chunks in it.
 *
 * For more information about regions please check [Regions's page on GamePedia](https://minecraft.gamepedia.com/Region_file_format)
 *
 * The region will be represented as a mutable map, you can add, modify and remove chunks easily using it's [ChunkPos] in the world.
 *
 * Note that all chunks stored here must actually be part of the region.
 *
 * Corrupt chunks will cause the region to fire [CorruptChunkException] when an attempt to read happens.
 *
 * Corrupt chunks can be manipulated with [setCorrupt], [getCorrupt] and [remove].
 *
 * @property position Where this region resides in the world.
 */
class Region(val position: RegionPos): AbstractMutableMap<ChunkPos, Chunk>() {
    private val chunks = arrayOfNulls<Chunk?>(1024)
    private val corruptChunks = mutableMapOf<ChunkPos, CorruptChunk>()

    /**
     * Creates a region pre-populated with chunks.
     * @param position Where this region resides in the world.
     * @param corruptChunks A list of corrupt chunks
     */
    constructor(position: RegionPos, chunks: List<Chunk?>, corruptChunks: List<CorruptChunk?>): this(position) {
        addAll(chunks)
        corruptChunks.asSequence().filterNotNull().forEach { setCorrupt(it) }
    }

    /**
     * Creates a region pre-populated with chunks.
     * @param position Where this region resides in the world.
     */
    constructor(position: RegionPos, chunks: List<Chunk?>): this(position) {
        addAll(chunks)
    }

    /**
     * Similar to [add] but adding a corrupt chunk.
     */
    fun setCorrupt(corruptChunk: CorruptChunk): Chunk? {
        corruptChunk.position.checkValid()
        val removed = remove(corruptChunk.position)
        corruptChunks[corruptChunk.position] = corruptChunk
        return removed
    }

    /**
     * Sililar to [get] but will get only corrupt chunks without firing exception.
     */
    fun getCorrupt(key: ChunkPos): CorruptChunk? = corruptChunks[key]

    /**
     * Adds a chunk to this region.
     * @param key Where the chunk resides. It must be valid for this region.
     * @param value The chunk that is being added
     */
    override fun put(key: ChunkPos, value: Chunk): Chunk? {
        check(key == value.position) {
            "The chunk's key doesn't match the chunk's value. Key: $key, Chunk: ${value.position}"
        }
        key.checkValid()
        val offset = offset(key)
        val before = chunks[offset]
        chunks[offset] = value
        corruptChunks -= key
        return before
    }

    private fun ChunkPos.checkValid() {
        val regX = floor(xPos / 32.0).toInt()
        val regZ = floor(zPos / 32.0).toInt()
        check(regX == position.xPos && regZ == position.zPos) {
            "The chunk $this is not part of the region $position. It's part of r.$regX.$regZ.mca"
        }
    }

    private fun ChunkPos.isValid(): Boolean {
        val regX = floor(xPos / 32.0).toInt()
        val regZ = floor(zPos / 32.0).toInt()
        return regX == position.xPos && regZ == position.zPos
    }

    /**
     * Returns the chunk content for the given key or null if the chunk is not part of this region or is empty.
     * @param key The chunk position in the world
     * @throws CorruptChunkException If the [key] points to a corrupt chunk
     */
    @Throws(CorruptChunkException::class)
    override fun get(key: ChunkPos): Chunk? {
        if (!key.isValid()) {
            return null
        }

        corruptChunks[key]?.let { corruptChunk ->
            throw CorruptChunkException(corruptChunk)
        }

        return chunks[offset(key)]
    }

    /**
     * Removes a chunk from this region, thus making it empty. Also removes corrupt chunks.
     * @param key The chunk position in the world
     */
    override fun remove(key: ChunkPos): Chunk? {
        if (!key.isValid()) {
            return null
        }
        val offset = offset(key)
        val before = chunks[offset]
        chunks[offset] = null
        corruptChunks -= key
        return before
    }

    /**
     * Removes a chunk from this region, thus making it empty. But only removes if the current value matches the given value.
     * Does **not** remove corrupt chunks.
     * @param key The chunk position in the world
     * @param value The expected value. Will only remove if the current value matches this value.
     */
    override fun remove(key: ChunkPos, value: Chunk): Boolean {
        if (!key.isValid()) {
            return false
        }
        val offset = offset(key)
        val before = chunks[offset]
        return if (value == before) {
            chunks[offset] = null
            true
        } else {
            false
        }
    }

    private fun offset(chunkPos: ChunkPos) = internalOffset(chunkPos.xPos - position.xPos * 32, chunkPos.zPos - position.zPos * 32)
    private fun internalOffset(x: Int, z: Int) = ((x % 32) + (z % 32) * 32)

    /**
     * Shortcut of [put].
     * @param chunk The Chunk that is being added. It must be within the range of this region.
     */
    fun add(chunk: Chunk) {
        put(chunk.position, chunk)
    }

    /**
     * Adds all chunks in the list.
     * @param chunks The chunks that will be added. They must be within the range of this region. The list must not contains null values.
     */
    @JvmSynthetic
    @JvmName("addAllNotNull")
    fun addAll(chunks: List<Chunk>) {
        chunks.forEach(this::add)
    }

    /**
     * Adds all chunks in the list.
     * @param chunks The chunks that will be added. They must be within the range of this region. Null values are ignored.
     */
    @JvmName("addAll")
    fun addAll(chunks: List<Chunk?>) {
        chunks.asSequence().filterNotNull().forEach(this::add)
    }

    /**
     * Adds all chunks in the list.
     * @param chunks The chunks that will be added. They must be within the range of this region. Null values are ignored.
     */
    @Deprecated("Java users should call `Region.addAll`", ReplaceWith("addAll(chunks)"))
    fun addAllNullable(chunks: List<Chunk?>) = addAll(chunks)

    /**
     * Gets a immutable map with all corrupt chunks in this region.
     */
    fun getCorruptChunks() = corruptChunks.toMap()

    /**
     * A mutable set containing mutable entries which when modified will also modify the [Region] object.
     *
     * Corrupt chunks are skipped.
     */
    override val entries: MutableSet<MutableMap.MutableEntry<ChunkPos, Chunk>>
        get() = object : AbstractMutableSet<MutableMap.MutableEntry<ChunkPos, Chunk>>() {
            override val size: Int
                get() = chunks.count { it != null }

            override fun add(element: MutableMap.MutableEntry<ChunkPos, Chunk>): Boolean {
                val removed = put(element.key, element.value)
                return removed != element.value
            }

            override fun iterator(): MutableIterator<MutableMap.MutableEntry<ChunkPos, Chunk>> {
                return object : MutableIterator<MutableMap.MutableEntry<ChunkPos, Chunk>> {
                    lateinit var current: MutableMap.MutableEntry<ChunkPos, Chunk>
                    val iter = chunks.asSequence().filterNotNull().map {  chunk ->
                        object : MutableMap.MutableEntry<ChunkPos, Chunk> {
                            override val key: ChunkPos = chunk.position
                            override val value: Chunk
                                get() = get(key) ?: chunk

                            override fun setValue(newValue: Chunk): Chunk {
                                return put(key, newValue) ?: chunk
                            }
                        }
                    }.iterator()

                    override fun hasNext(): Boolean {
                        return iter.hasNext()
                    }

                    override fun next(): MutableMap.MutableEntry<ChunkPos, Chunk> {
                        current = iter.next()
                        return current
                    }

                    override fun remove() {
                        this@Region.remove(current.key)
                    }
                }
            }
        }
}
