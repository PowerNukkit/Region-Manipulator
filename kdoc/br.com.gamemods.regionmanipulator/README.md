[br.com.gamemods.regionmanipulator](./index.md)

## Package br.com.gamemods.regionmanipulator

### Types

| Name | Summary |
|---|---|
| [Chunk](-chunk/index.md) | `data class Chunk`<br>A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file. |
| [ChunkPos](-chunk-pos/index.md) | `data class ChunkPos`<br>A chunk position. May be used for different contexts but is usually used to indicate the position in the world. |
| [CorruptChunk](-corrupt-chunk/index.md) | `data class CorruptChunk`<br>This is the same as [Chunk](-chunk/index.md) but holding a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) instead of [NbtFile](#) because the chunk content could not be parsed. |
| [Region](-region/index.md) | `class Region : `[`AbstractMutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-abstract-mutable-map/index.html)`<`[`ChunkPos`](-chunk-pos/index.md)`, `[`Chunk`](-chunk/index.md)`>`<br>A region file stores a group of 32 x 32 chunks in it. |
| [RegionIO](-region-i-o/index.md) | `object RegionIO`<br>Contains usefull methods do read and write [Region](-region/index.md) from [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). |
| [RegionPos](-region-pos/index.md) | `data class RegionPos`<br>A region position extracted from the region file name. |

### Exceptions

| Name | Summary |
|---|---|
| [CorruptChunkException](-corrupt-chunk-exception/index.md) | `class CorruptChunkException : `[`RuntimeException`](https://docs.oracle.com/javase/6/docs/api/java/lang/RuntimeException.html)<br>Fired when attempting to access a corrupt chunk from a [Region](-region/index.md) object. |
