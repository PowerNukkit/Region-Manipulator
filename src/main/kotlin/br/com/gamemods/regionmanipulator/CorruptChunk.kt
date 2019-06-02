package br.com.gamemods.regionmanipulator

import br.com.gamemods.nbtmanipulator.NbtFile
import java.util.*

/**
 * This is the same as [Chunk] but holding a [ByteArray] instead of [NbtFile] because the chunk content could not be parsed.
 *
 * The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.
 * @property lastModified The last modification registered in MCA file. It will not be updated automatically.
 * @property position The X/Z position in the world where this chunk resides.
 * @property chunkContent The bytes that compounds this chunk. Be aware that it's corrupt.
 * @property throwable The throwable that prevented the chunk from loading
 */
data class CorruptChunk(val position: ChunkPos, var lastModified: Date, var chunkContent: ByteArray, var throwable: Throwable) {
    /**
     * Constructs the corrupt chunk calculating the chunk position based on the region file position and the chunk index.
     */
    constructor(regionPos: RegionPos, index: Int, lastModified: Date, chunkContent: ByteArray, throwable: Throwable)
            : this(calculateChunkPos(regionPos, index), lastModified, chunkContent, throwable)

    private companion object {
        private fun calculateChunkPos(regionPos: RegionPos, index: Int): ChunkPos {
            val offsetX = index % 32
            val offsetZ = (index / 32) % 32

            val minRegX = regionPos.xPos * 32
            val minRegZ = regionPos.zPos * 32

            val chunkX = minRegX + offsetX
            val chunkZ = minRegZ + offsetZ

            return ChunkPos(chunkX, chunkZ)
        }
    }

    /**
     * Properly checks the equality of the chunk contents.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CorruptChunk

        if (position != other.position) return false
        if (lastModified != other.lastModified) return false
        if (!chunkContent.contentEquals(other.chunkContent)) return false
        if (throwable != other.throwable) return false

        return true
    }

    /**
     * Properly calculates the hashcode of the chunk contents.
     */
    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + lastModified.hashCode()
        result = 31 * result + chunkContent.contentHashCode()
        result = 31 * result + throwable.hashCode()
        return result
    }
}
