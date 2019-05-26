package br.com.gamemods.regionmanipulator

/**
 * A region position extracted from the region file name.
 *
 * `r.-2.3.mca` must be `Region(-2,3)` for example
 * @property xPos The first number in the region file name. May be negative.
 * @property zPos The second number in the region file name. May be negative.
 */
data class RegionPos(val xPos: Int, val zPos: Int) {
    private constructor(mcaFileNameParts: List<String>): this(mcaFileNameParts[1].toInt(), mcaFileNameParts[2].toInt())

    /**
     * Parses a region file name. Only support valid names like `r.-3.2.mca`.
     * @param mcaFileName A valid file name
     */
    constructor(mcaFileName: String): this(mcaFileName.split('.'))
}
