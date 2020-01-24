[br.com.gamemods.regionmanipulator](../index.md) / [RegionIO](index.md) / [readRegion](./read-region.md)

# readRegion

`@JvmStatic fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`): `[`Region`](../-region/index.md)

Reads a region identifying it's [RegionPos](../-region-pos/index.md) by the name of the file.

### Parameters

`file` - The file to be read. It must be named like r.1.-2.mca where 1 is it's xPos and -2 it's zPos.

### Exceptions

`IOException` - If an IO exception occurs while reading the MCA headers.
Exceptions which happens while loading the chunk's body are reported in [CorruptChunk.throwable](../-corrupt-chunk/throwable.md)
which can be acceded using [Region.getCorrupt](../-region/get-corrupt.md) or [Region.getCorruptChunks](../-region/get-corrupt-chunks.md)`@JvmStatic fun readRegion(file: `[`File`](https://docs.oracle.com/javase/6/docs/api/java/io/File.html)`, pos: `[`RegionPos`](../-region-pos/index.md)`): `[`Region`](../-region/index.md)

Reads a region using a specified [RegionPos](../-region-pos/index.md).

### Parameters

`file` - The file to be read. Can have any name

`pos` - The position of this region. Must match the content's otherwise it won't be manipulable.

### Exceptions

`IOException` - If an IO exception occurs while reading the MCA headers.
Exceptions which happens while loading the chunk's body are reported in [CorruptChunk.throwable](../-corrupt-chunk/throwable.md)
which can be acceded using [Region.getCorrupt](../-region/get-corrupt.md) or [Region.getCorruptChunks](../-region/get-corrupt-chunks.md)