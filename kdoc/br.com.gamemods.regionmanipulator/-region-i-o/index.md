---
title: RegionIO - 
---

[br.com.gamemods.regionmanipulator](../index.html) / [RegionIO](./index.html)

# RegionIO

`object RegionIO`

Contains usefull methods do read and write [Region](../-region/index.html) from [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html).

### Functions

| [readRegion](read-region.html) | `fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Region`](../-region/index.html)<br>Reads a region identifying it's [RegionPos](../-region-pos/index.html) by the name of the file.`fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, pos: `[`RegionPos`](../-region-pos/index.html)`): `[`Region`](../-region/index.html)<br>Reads a region using a specified [RegionPos](../-region-pos/index.html). |
| [writeRegion](write-region.html) | `fun writeRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, region: `[`Region`](../-region/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Saves a [Region](../-region/index.html) in a [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). The region file will be entirely rebuilt. |

