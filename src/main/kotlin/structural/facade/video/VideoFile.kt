package structural.facade.video

class VideoFile(name: String) {
    val codecType = name.substring(name.indexOf(".") + 1)
}