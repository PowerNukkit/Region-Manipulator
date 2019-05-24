# Region Manipulator
A Kotlin/Java library that allows you to read and write `mca` files in a simple way.

## Adding to your project
The library is shared in the maven center, so you don't need to declare any custom repository.

### Gradle
```groovy
repositories {
    mavenCentral() // or jcenter()
}

dependencies {
    compile 'br.com.gamemods:region-manipulator:0.0.1'
}
```

### Maven
```xml
<dependencies>
    <dependency>
      <groupId>br.com.gamemods</groupId>
      <artifactId>region-manipulator</artifactId>
      <version>0.0.1</version>
    </dependency>
</dependencies>
```

### Ivy
```xml
<dependency org='br.com.gamemods' name='nbt-manipulator' rev='0.0.1'>
  <artifact name='region-manipulator' ext='jar' />
</dependency>
```

## Examples
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
