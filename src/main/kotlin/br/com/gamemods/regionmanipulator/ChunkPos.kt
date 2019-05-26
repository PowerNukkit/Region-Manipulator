package br.com.gamemods.regionmanipulator

/**
 * A chunk position. May be used for different contexts but is usually used to indicate the position in the world.
 * @property xPos May be negative.
 * @property zPos May be negative.
 */
data class ChunkPos(val xPos: Int, val zPos: Int)
