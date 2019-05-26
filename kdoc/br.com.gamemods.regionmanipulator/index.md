---
title: br.com.gamemods.regionmanipulator - 
---

[br.com.gamemods.regionmanipulator](./index.html)

## Package br.com.gamemods.regionmanipulator

### Types

| [Chunk](-chunk/index.html) | `data class Chunk`<br>A chunk is piece of 16 x 256 x 16 blocks which is contained in a region file. |
| [ChunkPos](-chunk-pos/index.html) | `data class ChunkPos`<br>A chunk position. May be used for different contexts but is usually used to indicate the position in the world. |
| [Region](-region/index.html) | `class Region : `[`AbstractMutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-abstract-mutable-map/index.html)`<`[`ChunkPos`](-chunk-pos/index.html)`, `[`Chunk`](-chunk/index.html)`>`<br>A region file stores a group of 32 x 32 chunks in it. |
| [RegionIO](-region-i-o/index.html) | `object RegionIO`<br>Contains usefull methods do read and write [Region](-region/index.html) from [File](https://docs.oracle.com/javase/6/docs/api/java/io/File.html). |
| [RegionPos](-region-pos/index.html) | `data class RegionPos`<br>A region position extracted from the region file name. |

