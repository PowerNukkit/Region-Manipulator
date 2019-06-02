[br.com.gamemods.regionmanipulator](../index.md) / [Region](./index.md)

# Region

`class Region : `[`AbstractMutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-abstract-mutable-map/index.html)`<`[`ChunkPos`](../-chunk-pos/index.md)`, `[`Chunk`](../-chunk/index.md)`>`

A region file stores a group of 32 x 32 chunks in it.

For more information about regions please check [Regions's page on GamePedia](https://minecraft.gamepedia.com/Region_file_format)

The region will be represented as a mutable map, you can add, modify and remove chunks easily using it's [ChunkPos](../-chunk-pos/index.md) in the world.

Note that all chunks stored here must actually be part of the region.

Corrupt chunks will cause the region to fire [CorruptChunkException](../-corrupt-chunk-exception/index.md) when an attempt to read happens.

Corrupt chunks can be manipulated with [setCorrupt](set-corrupt.md), [getCorrupt](get-corrupt.md) and [remove](remove.md).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Region(position: `[`RegionPos`](../-region-pos/index.md)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>, corruptChunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CorruptChunk`](../-corrupt-chunk/index.md)`?>)`<br>`Region(position: `[`RegionPos`](../-region-pos/index.md)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>)`<br>Creates a region pre-populated with chunks.`Region(position: `[`RegionPos`](../-region-pos/index.md)`)`<br>A region file stores a group of 32 x 32 chunks in it. |

### Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | `val entries: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`MutableEntry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)`<`[`ChunkPos`](../-chunk-pos/index.md)`, `[`Chunk`](../-chunk/index.md)`>>`<br>A mutable set containing mutable entries which when modified will also modify the [Region](./index.md) object. |
| [position](position.md) | `val position: `[`RegionPos`](../-region-pos/index.md)<br>Where this region resides in the world. |

### Functions

| Name | Summary |
|---|---|
| [add](add.md) | `fun add(chunk: `[`Chunk`](../-chunk/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Shortcut of [put](put.md). |
| [addAll](add-all.md) | `fun addAll(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun addAll(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds all chunks in the list. |
| [addAllNullable](add-all-nullable.md) | `fun ~~addAllNullable~~(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.md)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds all chunks in the list. |
| [get](get.md) | `fun get(key: `[`ChunkPos`](../-chunk-pos/index.md)`): `[`Chunk`](../-chunk/index.md)`?`<br>Returns the chunk content for the given key or null if the chunk is not part of this region or is empty. |
| [getCorrupt](get-corrupt.md) | `fun getCorrupt(key: `[`ChunkPos`](../-chunk-pos/index.md)`): `[`CorruptChunk`](../-corrupt-chunk/index.md)`?`<br>Sililar to [get](get.md) but will get only corrupt chunks without firing exception. |
| [getCorruptChunks](get-corrupt-chunks.md) | `fun getCorruptChunks(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`ChunkPos`](../-chunk-pos/index.md)`, `[`CorruptChunk`](../-corrupt-chunk/index.md)`>`<br>Gets a immutable map with all corrupt chunks in this region. |
| [put](put.md) | `fun put(key: `[`ChunkPos`](../-chunk-pos/index.md)`, value: `[`Chunk`](../-chunk/index.md)`): `[`Chunk`](../-chunk/index.md)`?`<br>Adds a chunk to this region. |
| [remove](remove.md) | `fun remove(key: `[`ChunkPos`](../-chunk-pos/index.md)`): `[`Chunk`](../-chunk/index.md)`?`<br>Removes a chunk from this region, thus making it empty. Also removes corrupt chunks.`fun remove(key: `[`ChunkPos`](../-chunk-pos/index.md)`, value: `[`Chunk`](../-chunk/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Removes a chunk from this region, thus making it empty. But only removes if the current value matches the given value. Does **not** remove corrupt chunks. |
| [setCorrupt](set-corrupt.md) | `fun setCorrupt(corruptChunk: `[`CorruptChunk`](../-corrupt-chunk/index.md)`): `[`Chunk`](../-chunk/index.md)`?`<br>Similar to [add](add.md) but adding a corrupt chunk. |
