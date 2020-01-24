# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
Click the link above to see the future.

## [2.0.0] - 2020-01-24
[Downloads from maven central.][Download 2.0.0]

[Kotlin Documentation][KDoc 2.0.0]

### Changed
- Added new properties to the `data class CorruptChunk`
- Changed the `CorruptChunk` constructors **(Breaking Change)**
- `CorruptChunk.chunkContent` is now nullable **(Breaking Change)**
- `RegionIO.readRegion` and `RegionIO.writeRegion` now throws `IOException` in Java **(Breaking Change)**
- `RegionIO.readRegion` can now handle more corrupted chunks scenarios, preventing total failures while reading the MCA file
- Updated [NBT-Manipulator to `2.0.0`][NBT 2.0.0] 
- Updated Kotlin to 1.3.61

### Fixed
- [#4] `EOFException` when attempt to read a MCA file which contains incomplete corrupted chunks

## [1.1.0] - 2019-06-02
[Downloads from maven central.][Download 1.1.0]

[Kotlin Documentation][KDoc 1.1.0]

### Added
- Methods to manipulate corrupt chunks

### Changed
- Updated [NBT-Manipulator to `1.1.0`][NBT 1.1.0]

### Fixed
- [#2] Corrupt chunk prevents the entire region to load
- [#3] KotlinNullPointerException when reading some region files

## [1.0.1] - 2019-05-27
[Downloads from maven central.][Download 1.0.1]

[Kotlin Documentation][KDoc 1.0.1]

### Changed
- Updated [NBT-Manipulator to `1.0.1`][NBT 1.0.1]

## [1.0.0] - 2019-05-27
[Downloads from maven central.][Download 1.0.0]

[Kotlin Documentation][KDoc 1.0.0]

### Changed
- Updated [NBT-Manipulator to `1.0.0`][NBT 1.0.0]

## [0.0.4] - 2019-05-27
[Downloads from maven central.][Download 0.0.4]

### Added
- This changelog file
- Documentation to all public types, methods and properties.
- Static methods for java users calling `RegionIO`
- `Region.addAll` for java users.
- New constructor to `RegionPos` which accepts the region file name.

### Changed
- `Region.put` will now check if the key matches the value's position
- `Region.addAllNotNull` is now synthetic, java users should always call `Region.addAll`
- `Region.addAllNullable`is now deprecated. Java users should always call `Region.addAll`
- Updated [NBT-Manipulator to `0.0.2`][NBT 0.0.2]

### Fixed
- Potential exception when trying to remove a chunk that is not valid for the region

### Changed
- `RegionIO.ChunkInfo` to private.

## [0.0.3] - 2019-05-25
[Downloads from maven central.][Download 0.0.3]
### Changed
- The dependency to [NBT-Manipulator] from `implementation` to `compile` so it can get inherited.

## [0.0.2] - 2019-05-25
[Downloads from maven central.][Download 0.0.2]
### Changed
- JavaDoc will not generate when building on Java 9+ due to a dokka issue
- The targetCompatibility to Java 8
- The `RegionIO.deflate` method is now private

### Fixed
- [#1] IndexOutOfBoundsException when writing an empty chunk

## [0.0.1] - 2019-05-23
[Downloads from maven central.][Download 0.0.1]
### Added
- API to read and write to/from MCA files using `RegionIO`
- API to freely manipulate `Region` and `Chunk` data loaded in memory

[Unreleased]: https://github.com/GameModsBR/Region-Manipulator/compare/v2.0.0...HEAD
[2.0.0]: https://github.com/GameModsBR/Region-Manipulator/compare/v1.1.0..v2.0.0
[1.1.0]: https://github.com/GameModsBR/Region-Manipulator/compare/v1.0.1..v1.1.0
[1.0.1]: https://github.com/GameModsBR/Region-Manipulator/compare/v1.0.0..v1.0.1
[1.0.0]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.4..v1.0.0
[0.0.4]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.3..v0.0.4
[0.0.3]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.2..v0.0.3
[0.0.2]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.1..v0.0.2
[0.0.1]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.0..v0.0.1

[Download 2.0.0]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/2.0.0/
[Download 1.1.0]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/1.1.0/
[Download 1.0.1]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/1.0.1/
[Download 1.0.0]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/1.0.0/
[Download 0.0.4]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.4/
[Download 0.0.3]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.3/
[Download 0.0.2]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.2/
[Download 0.0.1]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.1/

[KDoc 2.0.0]: https://github.com/GameModsBR/Region-Manipulator/blob/3f6f29a823df9ce6f0c4b30ff35900119f7a62af/kdoc/br.com.gamemods.regionmanipulator/index.md
[KDoc 1.1.0]: https://github.com/GameModsBR/Region-Manipulator/blob/3f6f29a823df9ce6f0c4b30ff35900119f7a62af/kdoc/br.com.gamemods.regionmanipulator/index.md
[KDoc 1.0.1]: https://github.com/GameModsBR/Region-Manipulator/blob/d8893b801af7a65977b2b457009902da8cd10d47/kdoc/br.com.gamemods.regionmanipulator/index.md
[KDoc 1.0.0]: https://github.com/GameModsBR/Region-Manipulator/blob/4bea23fa037af955505ed1aff78fbae8e87a589a/kdoc/br.com.gamemods.regionmanipulator/index.md

[NBT-Manipulator]: https://github.com/GameModsBR/NBT-Manipulator/
[NBT 2.0.0]: https://gamemodsbr.github.io/NBT-Manipulator/CHANGELOG.html#200---2020-01-24
[NBT 1.1.0]: https://gamemodsbr.github.io/NBT-Manipulator/CHANGELOG.html#110---2019-06-02
[NBT 1.0.1]: https://gamemodsbr.github.io/NBT-Manipulator/CHANGELOG.html#101---2019-05-27
[NBT 1.0.0]: https://gamemodsbr.github.io/NBT-Manipulator/CHANGELOG.html#100---2019-05-27
[NBT 0.0.2]: https://gamemodsbr.github.io/NBT-Manipulator/CHANGELOG.html#002---2019-05-27

[#1]: https://github.com/GameModsBR/Region-Manipulator/issues/1
[#2]: https://github.com/GameModsBR/Region-Manipulator/issues/2
[#3]: https://github.com/GameModsBR/Region-Manipulator/issues/3
[#4]: https://github.com/GameModsBR/Region-Manipulator/issues/4

