[br.com.gamemods.regionmanipulator](../index.md) / [Region](index.md) / [get](./get.md)

# get

`fun get(key: `[`ChunkPos`](../-chunk-pos/index.md)`): `[`Chunk`](../-chunk/index.md)`?`

Returns the chunk content for the given key or null if the chunk is not part of this region or is empty.

### Parameters

`key` - The chunk position in the world

### Exceptions

`CorruptChunkException` - If the [key](get.md#br.com.gamemods.regionmanipulator.Region$get(br.com.gamemods.regionmanipulator.ChunkPos)/key) points to a corrupt chunk