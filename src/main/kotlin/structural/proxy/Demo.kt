package structural.proxy

import structural.proxy.repository.YouTubeRepository
import structural.proxy.youtube.YouTubeClass

object Demo {

    fun main() {
        val defaultRepository = YouTubeRepository(YouTubeClass())
        val smartRepository = YouTubeRepository(YouTubeCacheProxy())

        test(defaultRepository) // Без кеширования...
        test(smartRepository) // С кешированием!
    }

    private fun test(downloader: YouTubeRepository) {
        downloader.renderVideoPage("catzzzzzzzzz")
        downloader.renderPopularVideosPage()
    }
}
