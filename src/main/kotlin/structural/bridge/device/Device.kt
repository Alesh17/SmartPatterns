package structural.bridge.device

/** В данном примере: абстракция. */
interface Device {

    var isEnabled: Boolean
    var channel: Int
    var volume: Int

    fun enable()
    fun disable()
}