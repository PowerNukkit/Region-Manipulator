[br.com.gamemods.regionmanipulator](../index.md) / [CorruptChunk](index.md) / [length](./length.md)

# length

`var length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`

The actual amount of bytes that this chunk is using in it's allocated section. Always less or equals to [allocationSize](allocation-size.md).
Null if the reader couldn't read this information from the chunk's body.

### Property

`length` - The actual amount of bytes that this chunk is using in it's allocated section. Always less or equals to [allocationSize](allocation-size.md).
Null if the reader couldn't read this information from the chunk's body.