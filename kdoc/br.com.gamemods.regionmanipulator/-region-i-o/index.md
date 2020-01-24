[br.com.gamemods.regionmanipulator](../index.md) / [RegionIO](./index.md)

# RegionIO

`object RegionIO`

Contains usefull methods do read and write [Region](../-region/index.md) from [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html).

### Functions

| Name | Summary |
|---|---|
| [readRegion](read-region.md) | `fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Region`](../-region/index.md)<br>Reads a region identifying it's [RegionPos](../-region-pos/index.md) by the name of the file.`fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, pos: `[`RegionPos`](../-region-pos/index.md)`): `[`Region`](../-region/index.md)<br>Reads a region using a specified [RegionPos](../-region-pos/index.md). |
| [writeRegion](write-region.md) | `fun writeRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, region: `[`Region`](../-region/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Saves a [Region](../-region/index.md) in a [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). The region file will be entirely rebuilt. |
