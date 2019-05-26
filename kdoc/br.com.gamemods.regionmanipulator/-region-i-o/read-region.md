---
title: RegionIO.readRegion - 
---

[br.com.gamemods.regionmanipulator](../index.html) / [RegionIO](index.html) / [readRegion](./read-region.html)

# readRegion

`@JvmStatic fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Region`](../-region/index.html)

Reads a region identifying it's [RegionPos](../-region-pos/index.html) by the name of the file.

### Parameters

`file` - The file to be read. It must be named like r.1.-2.mca where 1 is it's xPos and -2 it's zPos.`@JvmStatic fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, pos: `[`RegionPos`](../-region-pos/index.html)`): `[`Region`](../-region/index.html)

Reads a region using a specified [RegionPos](../-region-pos/index.html).

### Parameters

`file` - The file to be read. Can have any name

`pos` - The position of this region. Must match the content's otherwise it won't be manipulable.