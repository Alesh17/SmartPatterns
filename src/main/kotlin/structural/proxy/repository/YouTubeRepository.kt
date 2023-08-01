package structural.proxy.repository

import structural.proxy.youtube.YouTubeLibrary

class YouTubeRepository(private val api: YouTubeLibrary) {
    fun renderVideoPage(id: String) = api.getVideo(id)
    fun renderPopularVideosPage() = api.getVideos()
}