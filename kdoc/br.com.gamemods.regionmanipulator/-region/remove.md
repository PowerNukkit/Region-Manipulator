[br.com.gamemods.regionmanipulator](../index.md) / [Region](index.md) / [remove](./remove.md)

# remove

`fun remove(key: `[`ChunkPos`](../-chunk-pos/index.md)`): `[`Chunk`](../-chunk/index.md)`?`

Removes a chunk from this region, thus making it empty. Also removes corrupt chunks.

### Parameters

`key` - The chunk position in the world`fun remove(key: `[`ChunkPos`](../-chunk-pos/index.md)`, value: `[`Chunk`](../-chunk/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Removes a chunk from this region, thus making it empty. But only removes if the current value matches the given value.
Does **not** remove corrupt chunks.

### Parameters

`key` - The chunk position in the world

`value` - The expected value. Will only remove if the current value matches this value.