

### All Types

| Name | Summary |
|---|---|
| [br.com.gamemods.regionmanipulator.Chunk](../br.com.gamemods.regionmanipulator/-chunk/index.md) | A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file. |
| [br.com.gamemods.regionmanipulator.ChunkPos](../br.com.gamemods.regionmanipulator/-chunk-pos/index.md) | A chunk position. May be used for different contexts but is usually used to indicate the position in the world. |
| [br.com.gamemods.regionmanipulator.CorruptChunk](../br.com.gamemods.regionmanipulator/-corrupt-chunk/index.md) | This is the same as [Chunk](../br.com.gamemods.regionmanipulator/-chunk/index.md) but holding a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) instead of [NbtFile](#) because the chunk content could not be parsed. |
| [br.com.gamemods.regionmanipulator.CorruptChunkException](../br.com.gamemods.regionmanipulator/-corrupt-chunk-exception/index.md) | Fired when attempting to access a corrupt chunk from a [Region](../br.com.gamemods.regionmanipulator/-region/index.md) object. |
| [br.com.gamemods.regionmanipulator.Region](../br.com.gamemods.regionmanipulator/-region/index.md) | A region file stores a group of 32 x 32 chunks in it. |
| [br.com.gamemods.regionmanipulator.RegionIO](../br.com.gamemods.regionmanipulator/-region-i-o/index.md) | Contains usefull methods do read and write [Region](../br.com.gamemods.regionmanipulator/-region/index.md) from [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). |
| [br.com.gamemods.regionmanipulator.RegionPos](../br.com.gamemods.regionmanipulator/-region-pos/index.md) | A region position extracted from the region file name. |
