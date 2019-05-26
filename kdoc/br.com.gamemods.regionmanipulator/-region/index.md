---
title: Region - 
---

[br.com.gamemods.regionmanipulator](../index.html) / [Region](./index.html)

# Region

`class Region : `[`AbstractMutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-abstract-mutable-map/index.html)`<`[`ChunkPos`](../-chunk-pos/index.html)`, `[`Chunk`](../-chunk/index.html)`>`

A region file stores a group of 32 x 32 chunks in it.

For more information about regions please check [Regions's page on GamePedia](https://minecraft.gamepedia.com/Region_file_format)

The region will be represented as a mutable map, you can add, modify and remove chunks easily using it's [ChunkPos](../-chunk-pos/index.html) in the world.

Note that all chunks stored here must actually be part of the region.

### Constructors

| [&lt;init&gt;](-init-.html) | `Region(position: `[`RegionPos`](../-region-pos/index.html)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.html)`?>)`<br>Creates a region pre-populated with chunks.`Region(position: `[`RegionPos`](../-region-pos/index.html)`)`<br>A region file stores a group of 32 x 32 chunks in it. |

### Properties

| [entries](entries.html) | `val entries: `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<`[`MutableEntry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/-mutable-entry/index.html)`<`[`ChunkPos`](../-chunk-pos/index.html)`, `[`Chunk`](../-chunk/index.html)`>>`<br>A mutable set containing mutable entries which when modified will also modify the [Region](./index.html) object. |
| [position](position.html) | `val position: `[`RegionPos`](../-region-pos/index.html)<br>Where this region resides in the world. |

### Functions

| [add](add.html) | `fun add(chunk: `[`Chunk`](../-chunk/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Shortcut of [put](put.html). |
| [addAll](add-all.html) | `fun addAll(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun addAll(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.html)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds all chunks in the list. |
| [addAllNullable](add-all-nullable.html) | `fun ~~addAllNullable~~(chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.html)`?>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Adds all chunks in the list. |
| [get](get.html) | `fun get(key: `[`ChunkPos`](../-chunk-pos/index.html)`): `[`Chunk`](../-chunk/index.html)`?`<br>Returns the chunk content for the given key or null if the chunk is not part of this region or is empty. |
| [put](put.html) | `fun put(key: `[`ChunkPos`](../-chunk-pos/index.html)`, value: `[`Chunk`](../-chunk/index.html)`): `[`Chunk`](../-chunk/index.html)`?`<br>Adds a chunk to this region. |
| [remove](remove.html) | `fun remove(key: `[`ChunkPos`](../-chunk-pos/index.html)`): `[`Chunk`](../-chunk/index.html)`?`<br>Removes a chunk from this region, thus making it empty.`fun remove(key: `[`ChunkPos`](../-chunk-pos/index.html)`, value: `[`Chunk`](../-chunk/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Removes a chunk from this region, thus making it empty. But only removes if the current value matches the given value. |

