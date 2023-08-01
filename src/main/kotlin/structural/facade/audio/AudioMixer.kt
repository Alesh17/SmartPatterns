package structural.facade.audio

import structural.facade.video.VideoFile
import java.io.File

object AudioMixer {

    fun fix(result: VideoFile): File {
        println("AudioMixer: fixing audio...")
        return File("tmp")
    }
}