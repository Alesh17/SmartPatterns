package structural.bridge.device

class Tv : Device {

    override var isEnabled = false
    override var channel = 1
    override var volume = 30

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }
}