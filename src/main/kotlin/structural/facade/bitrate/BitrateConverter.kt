package structural.facade.bitrate

import structural.facade.codec.Codec
import structural.facade.video.VideoFile

object BitrateConverter {

    fun convert(buffer: VideoFile, fromCodec: Codec, toCodec: Codec): VideoFile {
        println("BitrateConverter: writing file...")
        return buffer
    }
}