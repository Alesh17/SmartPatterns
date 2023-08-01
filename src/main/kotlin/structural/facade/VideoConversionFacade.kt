package structural.facade

import structural.facade.audio.AudioMixer
import structural.facade.bitrate.BitrateConverter
import structural.facade.codec.Codec
import structural.facade.codec.CodecFactory
import structural.facade.codec.Mpeg4CompressionCodec
import structural.facade.codec.OggCompressionCodec
import structural.facade.video.VideoFile
import java.io.File

/**
 * Facade (Фасад) — это структурный паттерн проектирования, который предоставляет простой интерфейс к сложной системе классов,
 * библиотеке или фреймворку.
 *
 * Данный паттерн — это простой интерфейс для работы со сложной подсистемой, содержащей множество классов.
 * Фасад может иметь урезанный интерфейс, не имеющий 100% функциональности, которой можно достичь,
 * используя сложную подсистему напрямую. Но он предоставляет именно те фичи, которые нужны клиенту, и скрывает все остальные.
 */
class VideoConversionFacade {

    fun convertVideo(fileName: String, format: String): File {
        val file = VideoFile(fileName)
        val codecOld = CodecFactory.extract(file)
        val codecNew: Codec = if (format == "mp4") Mpeg4CompressionCodec() else OggCompressionCodec()

        val step1 = BitrateConverter.convert(file, codecOld, codecNew)
        val step2 = AudioMixer.fix(step1)

        /* И еще куууча шагов... */

        return step2 /* step100 */
    }
}
