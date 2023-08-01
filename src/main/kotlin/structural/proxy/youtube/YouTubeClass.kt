package structural.proxy.youtube

import structural.proxy.video.Video

/** Класс библиотеки, который мы хотим запроксировать. */
class YouTubeClass : YouTubeLibrary {

    override fun getVideo(id: String): Video {
        return Video("cat", "cat.avi")
    }

    override fun getVideos(): HashMap<String, Video> {
        return hashMapOf(
            "cat" to Video("cat", "cat.avi"),
            "dog" to Video("dog", "dog.mp4"),
            "bird" to Video("bird", "bird.mpq")
        )
    }
}