[br.com.gamemods.regionmanipulator](../index.md) / [CorruptChunk](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`CorruptChunk(regionPos: `[`RegionPos`](../-region-pos/index.md)`, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, chunkContent: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?, location: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, allocationSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`

Constructs the corrupt chunk calculating the chunk position based on the region file position and the chunk index.

`CorruptChunk(position: `[`ChunkPos`](../-chunk-pos/index.md)`, lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, chunkContent: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?, location: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, allocationSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`

This is the same as [Chunk](../-chunk/index.md) but holding a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) instead of [NbtFile](#) because the chunk content could not be parsed.

The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.

