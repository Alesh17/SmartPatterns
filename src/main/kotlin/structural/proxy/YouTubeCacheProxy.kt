package structural.proxy

import structural.proxy.video.Video
import structural.proxy.youtube.YouTubeClass
import structural.proxy.youtube.YouTubeLibrary

/**
 * Proxy (Заместитель) — это структурный паттерн проектирования, который позволяет подставлять вместо реальных объектов
 * специальные объекты-заменители. Эти объекты перехватывают вызовы к оригинальному объекту, позволяя
 * сделать что-то до или после передачи вызова оригиналу.
 *
 * Данный паттерн предлагает создать новый класс-дублёр, имеющий тот же интерфейс, что и оригинальный служебный объект.
 * При получении запроса от клиента объект-заместитель сам бы создавал экземпляр служебного объекта
 * и переадресовывал бы ему всю реальную работу, выполняя при этом свою промежуточную логику. А благодаря одинаковому
 * интерфейсу, объект-заместитель можно передать в любой код, ожидающий сервисный объект.
 *
 * Decorator и Proxy имеют схожие структуры, но разные назначения. Они похожи тем, что оба построены на принципе композиции
 * и делегируют работу другим объектам.
 * Паттерны отличаются тем, что Proxy сам управляет жизнью сервисного объекта, а обёртывание Decorator'ов контролируется клиентом.
 */
class YouTubeCacheProxy : YouTubeLibrary {

    private val youtubeService: YouTubeLibrary = YouTubeClass()

    private val cacheAll = HashMap<String, Video>()
    private var cachePopular = HashMap<String, Video>()

    override fun getVideo(id: String): Video {
        var video = cacheAll[id]
        if (video == null) {
            video = youtubeService.getVideo(id)
            cacheAll[id] = video
        }
        return video
    }

    override fun getVideos(): HashMap<String, Video> {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.getVideos()
        }
        return cachePopular
    }

    fun reset() {
        cachePopular.clear()
        cacheAll.clear()
    }
}