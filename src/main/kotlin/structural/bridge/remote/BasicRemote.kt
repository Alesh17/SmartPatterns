package structural.bridge.remote

import structural.bridge.device.Device

open class BasicRemote(open val device: Device) : Remote {

    override fun power() {
        if (device.isEnabled) device.disable() else device.enable()
    }

    override fun volumeDown() {
        device.volume = device.volume - 10
    }

    override fun volumeUp() {
        device.volume = device.volume + 10
    }

    override fun channelDown() {
        device.channel = device.channel - 1
    }

    override fun channelUp() {
        device.channel = device.channel + 1
    }
}