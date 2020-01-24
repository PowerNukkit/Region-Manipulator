# Region Manipulator
A Kotlin/Java library that allows you to read and write `mca` files in a simple way.

Here you can find the library documentation:
* [Java Documentation](https://gamemodsbr.github.io/Region-Manipulator/javadoc)
* [Kotlin Documentation](https://gamemodsbr.github.io/Region-Manipulator/kdoc/br.com.gamemods.regionmanipulator/index.html)


You may also want to see the [changelog](CHANGELOG.md) file to be aware of all changes in the tool that may impact you.

## Adding to your project
The library is shared in the maven center, so you don't need to declare any custom repository.

### Gradle
```groovy
repositories {
    mavenCentral() // or jcenter()
}

dependencies {
    compile 'br.com.gamemods:region-manipulator:2.0.0'
}
```

### Maven
```xml
<dependencies>
    <dependency>
      <groupId>br.com.gamemods</groupId>
      <artifactId>region-manipulator</artifactId>
      <version>2.0.0</version>
    </dependency>
</dependencies>
```

### Ivy
```xml
<dependency org="br.com.gamemods" name="region-manipulator" rev="2.0.0"/>
```

### Direct JAR
Download it from [maven central](http://central.maven.org/maven2/br/com/gamemods/region-manipulator/).

## Examples
```kotlin
internal fun clearEntities(from: File, to: File) {
    val region = RegionIO.readRegion(from)
    val chunk = region[ChunkPos(region.position.xPos * 32, region.position.zPos * 32)] ?: return
    chunk.level.getCompoundList("Entities").forEach { 
        println(it.getString("id") + " "+ it.getDoubleList("Pos"))
    }
    chunk.level["Entities"] = emptyListOf<NbtCompound>().toNbtList()
    RegionIO.writeRegion(to, region)
}
```
