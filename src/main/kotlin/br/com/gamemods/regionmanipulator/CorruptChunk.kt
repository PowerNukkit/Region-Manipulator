package br.com.gamemods.regionmanipulator

import br.com.gamemods.nbtmanipulator.NbtFile
import java.util.*

/**
 * This is the same as [Chunk] but holding a [ByteArray] instead of [NbtFile] because the chunk content could not be parsed.
 *
 * The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.
 * @property lastModified The last modification registered in MCA file. It will not be updated automatically.
 *
 * @property position The X/Z position in the world where this chunk resides.
 *
 * @property chunkContent The bytes that compounds this chunk. Be aware that it's corrupt.
 * Null if the reader couldn't even reach the chunk's content section in the MCA file.
 *
 * @property location The position where the chunk is located in the MCA file.
 *
 * @property allocationSize The amount of data which was allocated to this chunk. The chunk don't need to use all the bytes.
 *
 * @property length The actual amount of bytes that this chunk is using in it's allocated section. Always less or equals to [allocationSize].
 * Null if the reader couldn't read this information from the chunk's body.
 *
 * @property compression The compression format used to compress the chunk content. `1` for GZIP and `2` for ZIP.
 * Null if the reader couldn't read this information from the chunk's body.
 *
 * @property throwable The throwable that prevented the chunk from loading.
 */
data class CorruptChunk(
    val position: ChunkPos, var lastModified: Date, var chunkContent: ByteArray?, var location: Long,
    var allocationSize: Int, var length: Int?, var compression: Int?, var throwable: Throwable
) {
    /**
     * Constructs the corrupt chunk calculating the chunk position based on the region file position and the chunk index.
     */
    constructor(
        regionPos: RegionPos, index: Int, lastModified: Date, chunkContent: ByteArray?, location: Long,
        allocationSize: Int, length: Int?, compression: Int?, throwable: Throwable
    ) : this(calculateChunkPos(regionPos, index), lastModified, chunkContent, location, allocationSize, length, compression, throwable)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CorruptChunk

        if (position != other.position) return false
        if (lastModified != other.lastModified) return false
        val chunkContent = chunkContent
        val otherChunkContent = other.chunkContent
        if (chunkContent != null) {
            if (otherChunkContent == null) return false
            if (!chunkContent.contentEquals(otherChunkContent)) return false
        } else if (otherChunkContent != null) return false
        if (location != other.location) return false
        if (allocationSize != other.allocationSize) return false
        if (length != other.length) return false
        if (compression != other.compression) return false
        if (throwable != other.throwable) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + lastModified.hashCode()
        result = 31 * result + (chunkContent?.contentHashCode() ?: 0)
        result = 31 * result + location.hashCode()
        result = 31 * result + allocationSize
        result = 31 * result + (length ?: 0)
        result = 31 * result + (compression ?: 0)
        result = 31 * result + throwable.hashCode()
        return result
    }


}
