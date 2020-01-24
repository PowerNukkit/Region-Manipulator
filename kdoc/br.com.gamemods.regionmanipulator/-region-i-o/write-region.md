[br.com.gamemods.regionmanipulator](../index.md) / [RegionIO](index.md) / [writeRegion](./write-region.md)

# writeRegion

`@JvmStatic fun writeRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, region: `[`Region`](../-region/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Saves a [Region](../-region/index.md) in a [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). The region file will be entirely rebuilt.

### Parameters

`file` - The file which will be written.

`region` - The region which will be saved.

### Exceptions

`IOException` - If an IO exception occurs while writing to the file.