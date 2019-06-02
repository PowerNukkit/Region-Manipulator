[br.com.gamemods.regionmanipulator](../index.md) / [Region](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Region(position: `[`RegionPos`](../-region-pos/index.md)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>, corruptChunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CorruptChunk`](../-corrupt-chunk/index.md)`?>)`

Creates a region pre-populated with chunks.

### Parameters

`position` - Where this region resides in the world.

`corruptChunks` - A list of corrupt chunks`Region(position: `[`RegionPos`](../-region-pos/index.md)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>)`

Creates a region pre-populated with chunks.

### Parameters

`position` - Where this region resides in the world.`Region(position: `[`RegionPos`](../-region-pos/index.md)`)`

A region file stores a group of 32 x 32 chunks in it.

For more information about regions please check [Regions's page on GamePedia](https://minecraft.gamepedia.com/Region_file_format)

The region will be represented as a mutable map, you can add, modify and remove chunks easily using it's [ChunkPos](../-chunk-pos/index.md) in the world.

Note that all chunks stored here must actually be part of the region.

Corrupt chunks will cause the region to fire [CorruptChunkException](../-corrupt-chunk-exception/index.md) when an attempt to read happens.

Corrupt chunks can be manipulated with [setCorrupt](set-corrupt.md), [getCorrupt](get-corrupt.md) and [remove](remove.md).

