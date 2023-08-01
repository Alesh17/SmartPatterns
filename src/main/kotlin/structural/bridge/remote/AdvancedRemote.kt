package structural.bridge.remote

import structural.bridge.device.Device

class AdvancedRemote(override val device: Device) : BasicRemote(device) {

    fun mute() {
        device.volume = 0
    }
}