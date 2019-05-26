package br.com.gamemods.regionmanipulator

import br.com.gamemods.nbtmanipulator.NbtCompound
import br.com.gamemods.nbtmanipulator.NbtFile
import java.util.*

/**
 * A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file.
 *
 * For more information about chunks please check the [Chunk's page on GamePedia](https://minecraft.gamepedia.com/Chunk).
 *
 * The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.
 * @property lastModified The last modification registered in MCA file. It will not be updated automatically.
 * @property nbtFile The root NBT that stores all information about this chunk
 */
data class Chunk(var lastModified: Date, var nbtFile: NbtFile) {
    /**
     * An easy access to the [NbtCompound] inside the [nbtFile].
     */
    val compound: NbtCompound
        get() = nbtFile.compound

    /**
     * The value of the `DataVersion` tag.
     */
    val dataVersion: Int
        get() = compound.getInt("DataVersion")

    /**
     * The `Level` tag, all chunk details like entities, tile entities, chunk sections, etc are stored here.
     */
    val level: NbtCompound
        get() = compound.getCompound("Level")

    /**
     * The X/Z position in the world where this chunk resides.
     */
    val position: ChunkPos
        get() = level.let {
            ChunkPos(it.getInt("xPos"), it.getInt("zPos"))
        }
}
