[br.com.gamemods.regionmanipulator](../index.md) / [CorruptChunk](index.md) / [compression](./compression.md)

# compression

`var compression: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

The compression format used to compress the chunk content. `1` for GZIP and `2` for ZIP.
Null if the reader couldn't read this information from the chunk's body.

### Property

`compression` - The compression format used to compress the chunk content. `1` for GZIP and `2` for ZIP.
Null if the reader couldn't read this information from the chunk's body.