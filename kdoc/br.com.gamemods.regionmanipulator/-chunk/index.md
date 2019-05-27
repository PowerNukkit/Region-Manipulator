[br.com.gamemods.regionmanipulator](../index.md) / [Chunk](./index.md)

# Chunk

`data class Chunk`

A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file.

For more information about chunks please check the [Chunk's page on GamePedia](https://minecraft.gamepedia.com/Chunk).

The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Chunk(lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, nbtFile: NbtFile)`<br>A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file. |

### Properties

| Name | Summary |
|---|---|
| [compound](compound.md) | `val compound: NbtCompound`<br>An easy access to the [NbtCompound](#) inside the [nbtFile](nbt-file.md). |
| [dataVersion](data-version.md) | `val dataVersion: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The value of the `DataVersion` tag. |
| [lastModified](last-modified.md) | `var lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)<br>The last modification registered in MCA file. It will not be updated automatically. |
| [level](level.md) | `val level: NbtCompound`<br>The `Level` tag, all chunk details like entities, tile entities, chunk sections, etc are stored here. |
| [nbtFile](nbt-file.md) | `var nbtFile: NbtFile`<br>The root NBT that stores all information about this chunk |
| [position](position.md) | `val position: `[`ChunkPos`](../-chunk-pos/index.md)<br>The X/Z position in the world where this chunk resides. |
