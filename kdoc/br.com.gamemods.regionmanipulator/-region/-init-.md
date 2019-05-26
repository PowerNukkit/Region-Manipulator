---
title: Region.<init> - 
---

[br.com.gamemods.regionmanipulator](../index.html) / [Region](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Region(position: `[`RegionPos`](../-region-pos/index.html)`, chunks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Chunk`](../-chunk/index.html)`?>)`

Creates a region pre-populated with chunks.

### Parameters

`position` - Where this region resides in the world.`Region(position: `[`RegionPos`](../-region-pos/index.html)`)`

A region file stores a group of 32 x 32 chunks in it.

For more information about regions please check [Regions's page on GamePedia](https://minecraft.gamepedia.com/Region_file_format)

The region will be represented as a mutable map, you can add, modify and remove chunks easily using it's [ChunkPos](../-chunk-pos/index.html) in the world.

Note that all chunks stored here must actually be part of the region.

