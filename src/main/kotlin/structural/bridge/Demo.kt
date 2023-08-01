package structural.bridge

import structural.bridge.device.Device
import structural.bridge.device.Radio
import structural.bridge.device.Tv
import structural.bridge.remote.AdvancedRemote
import structural.bridge.remote.BasicRemote

/**
 * Мост — это структурный паттерн проектирования, который разделяет один или несколько классов
 * на две отдельные иерархии:
 *
 * абстракцию (тех, кто не делает работу самостоятельно);
 * реализацию (тех, кто делает).
 *
 * Полезно, когда некую сущность нужно расширять в двух независимых плоскостях.
 */
object Demo {

    fun main() {
        testDevice(Tv())
        testDevice(Radio())
    }

    private fun testDevice(device: Device) {

        /* Девайс с обычным пультом */
        val basicRemote = BasicRemote(device)
        basicRemote.power()

        /* Девайс с навороченным пультом */
        val advancedRemote = AdvancedRemote(device)
        advancedRemote.power()
        advancedRemote.mute()
    }
}