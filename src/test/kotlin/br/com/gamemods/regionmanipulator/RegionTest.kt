package br.com.gamemods.regionmanipulator

import org.junit.Test
import java.io.File
import java.util.zip.ZipFile
import java.util.zip.ZipInputStream

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
}
