package structural.proxy.youtube

import structural.proxy.video.Video

interface YouTubeLibrary {
    fun getVideo(id: String): Video
    fun getVideos(): HashMap<String, Video>
}