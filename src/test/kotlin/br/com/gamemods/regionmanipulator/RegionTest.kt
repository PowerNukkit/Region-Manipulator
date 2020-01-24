package br.com.gamemods.regionmanipulator

import org.junit.Assert
import org.junit.Test
import java.io.EOFException
import java.io.File

class RegionTest {
    @Test
    fun testReadMCA1() {
        val tempFile = File.createTempFile("r.1,-1,", ".mca")
        tempFile.deleteOnExit()
        RegionTest::class.java.getResourceAsStream("/r.1.-1.mca").use { input ->
            tempFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }

        val mca = RegionIO.readRegion(tempFile, RegionPos(1, -1))
        RegionIO.writeRegion(tempFile, mca)
    }

    @Test
    fun testReadMCA2() {
        val tempFile = File.createTempFile("r.-1,-2,", ".mca")
        tempFile.deleteOnExit()
        RegionTest::class.java.getResourceAsStream("/r.-1.-2.mca").use { input ->
            tempFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }

        val mca = RegionIO.readRegion(tempFile, RegionPos(-1, -2))
        RegionIO.writeRegion(tempFile, mca)
    }

    @Test(expected = CorruptChunkException::class)
    fun testIssue2fix() {
        val tempFile = File.createTempFile("r.-1,-1,", ".mca")
        tempFile.deleteOnExit()
        RegionTest::class.java.getResourceAsStream("/issue.2.r.-1.-1.mca").use { input ->
            tempFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }
        val region = RegionIO.readRegion(tempFile, RegionPos(-1, -1))
        val chunkPos = ChunkPos(-24, -17)
        Assert.assertNotNull(region.getCorrupt(chunkPos))

        region[chunkPos]
    }

    @Test
    fun testIssue3fix() {
        val tempFile = File.createTempFile("r.0,-1,", ".mca")
        tempFile.deleteOnExit()
        RegionTest::class.java.getResourceAsStream("/issue-3.r.0.-1.mca").use { input ->
            tempFile.outputStream().use { output ->
                input.copyTo(output)
            }
        }
        RegionIO.readRegion(tempFile, RegionPos(0, -1))
    }

    @Test
    fun testMC1_15_1() {
        val tempFile = File.createTempFile("r.0,-1,", ".mca")
        tempFile.deleteOnExit()
        val mcaBytes = RegionTest::class.java.getResourceAsStream("/issue-4-v1.15.1-r.0.0.mca").use { it.buffered().readBytes() }
        tempFile.outputStream().use {
            it.buffered().use { output ->
                output.write(mcaBytes, 0, (mcaBytes.size*2 / 3) + 15) // Writing only 2/3 + 15 of the MCA file to force corruption
            }
        }
        val region = RegionIO.readRegion(tempFile, RegionPos(0, 0));
        Assert.assertEquals(40, region.getCorruptChunks().size)
        Assert.assertEquals(90, region.size)
        val corrupt = region.getCorrupt(ChunkPos(8, 10))
        Assert.assertNotNull(corrupt); corrupt!!
        Assert.assertEquals(4473, corrupt.length)
        Assert.assertEquals(1375, corrupt.chunkContent?.size)
        Assert.assertTrue(corrupt.throwable is EOFException)
    }
}
