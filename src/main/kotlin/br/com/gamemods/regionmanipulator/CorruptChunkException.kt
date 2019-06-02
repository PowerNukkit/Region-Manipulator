@file:Suppress("unused", "CanBeParameter", "MemberVisibilityCanBePrivate")

package br.com.gamemods.regionmanipulator

import java.lang.RuntimeException

/**
 * Fired when attempting to access a corrupt chunk from a [Region] object.
 * @property chunk The corrupted chunk details
 */
class CorruptChunkException(val chunk: CorruptChunk): RuntimeException("The chunk ${chunk.position} is corrupt!", chunk.throwable)
