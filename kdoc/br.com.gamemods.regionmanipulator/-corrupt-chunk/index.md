[br.com.gamemods.regionmanipulator](../index.md) / [CorruptChunk](./index.md)

# CorruptChunk

`data class CorruptChunk`

This is the same as [Chunk](../-chunk/index.md) but holding a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) instead of [NbtFile](#) because the chunk content could not be parsed.

The chunk represented here will be raw and unparsed, you will have access to it's NBT data to do any modification as you wish.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CorruptChunk(regionPos: `[`RegionPos`](../-region-pos/index.md)`, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, chunkContent: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?, location: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, allocationSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>Constructs the corrupt chunk calculating the chunk position based on the region file position and the chunk index.`CorruptChunk(position: `[`ChunkPos`](../-chunk-pos/index.md)`, lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, chunkContent: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?, location: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, allocationSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?, throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>This is the same as [Chunk](../-chunk/index.md) but holding a [ByteArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html) instead of [NbtFile](#) because the chunk content could not be parsed. |

### Properties

| Name | Summary |
|---|---|
| [allocationSize](allocation-size.md) | `var allocationSize: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The amount of data which was allocated to this chunk. The chunk don't need to use all the bytes. |
| [chunkContent](chunk-content.md) | `var chunkContent: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`?`<br>The bytes that compounds this chunk. Be aware that it's corrupt. Null if the reader couldn't even reach the chunk's content section in the MCA file. |
| [compression](compression.md) | `var compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>The compression format used to compress the chunk content. `1` for GZIP and `2` for ZIP. Null if the reader couldn't read this information from the chunk's body. |
| [lastModified](last-modified.md) | `var lastModified: `[`Date`](https://docs.oracle.com/javase/6/docs/api/java/util/Date.html)<br>The last modification registered in MCA file. It will not be updated automatically. |
| [length](length.md) | `var length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>The actual amount of bytes that this chunk is using in it's allocated section. Always less or equals to [allocationSize](allocation-size.md). Null if the reader couldn't read this information from the chunk's body. |
| [location](location.md) | `var location: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The position where the chunk is located in the MCA file. |
| [position](position.md) | `val position: `[`ChunkPos`](../-chunk-pos/index.md)<br>The X/Z position in the world where this chunk resides. |
| [throwable](throwable.md) | `var throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)<br>The throwable that prevented the chunk from loading. |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
