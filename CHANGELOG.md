# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
Click the link above to see the future.

## [1.0.0] - 2019-05-27
[Downloads from maven central.][Download 1.0.0]

[Kotlin Documentation][KDoc 1.0.0]

### Changed
- Updated NBT-Manipulator to `1.0.0`

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
- Updated NBT-Manipulator to `0.0.2`

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

[Unreleased]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.4...HEAD
[0.0.4]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.3..v0.0.4
[0.0.3]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.2..v0.0.3
[0.0.2]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.1..v0.0.2
[0.0.1]: https://github.com/GameModsBR/Region-Manipulator/compare/v0.0.0..v0.0.1

[Download 0.0.4]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.4/
[Download 0.0.3]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.3/
[Download 0.0.2]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.2/
[Download 0.0.1]: http://central.maven.org/maven2/br/com/gamemods/region-manipulator/0.0.1/

[KDoc 1.0.0]: https://github.com/GameModsBR/Region-Manipulator/blob/ce3d1eecb785e5bbb120a4c321defc42d53547e9/kdoc/br.com.gamemods.regionmanipulator/index.md

[NBT-Manipulator]: https://github.com/GameModsBR/NBT-Manipulator/
[#1]: https://github.com/GameModsBR/Region-Manipulator/issues/1

