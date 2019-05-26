# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
- This changelog file
- Documentation to all public types, methods and properties.
- Static methods for java users calling `RegionIO`

### Changed
- `RegionIO.ChunkInfo` to private.

## [0.0.3] - 2019-05-25
### Changed
- The dependency to [NBT-Manipulator] from `implementation` to `compile` so it can get inherited.

## [0.0.2] - 2019-05-25
### Changed
- JavaDoc will not generate when building on Java 9+ due to a dokka issue
- The targetCompatibility to Java 8
- The `RegionIO.deflate` method is now private

### Fixed
- [#1] IndexOutOfBoundsException when writing an empty chunk

## [0.0.1] - 2019-05-23
### Added
- API to read and write to/from MCA files using `RegionIO`
- API to freely manipulate `Region` and `Chunk` data loaded in memory

[Unreleased]: https://github.com/GameModsBR/Region-Manipulator/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/GameModsBR/Region-Manipulator/compare/a8f41900b32740648752ff214581eb8da0f928f6..v1.0.0
[#1]: https://github.com/GameModsBR/Region-Manipulator/issues/1
[NBT-Manipulator]: https://github.com/GameModsBR/NBT-Manipulator/
