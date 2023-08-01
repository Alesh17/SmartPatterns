package structural.facade.codec

import structural.facade.video.VideoFile

object CodecFactory {
    fun extract(file: VideoFile): Codec {
        return if (file.codecType == "mp4") Mpeg4CompressionCodec() else OggCompressionCodec()
    }
}