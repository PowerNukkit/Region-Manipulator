# Region Manipulator
A Kotlin/Java library that allows you to read and write `mca` files in a simple way.

Example:
```kotlin
internal fun clearEntities(from: File, to: File) {
    val region = RegionIO.readRegion(from)
    val chunk = region[ChunkPos(region.position.xPos * 32, region.position.zPos * 32)] ?: return
    chunk.level.getCompoundList("Entities").value.forEach { 
        println(it.getString("id") + " "+ it.getDoubleList("Pos"))
    }
    chunk.level["Entities"] = NbtList(mutableListOf<NbtDouble>())
    RegionIO.writeRegion(to, region)
}
```
