package behavioral.observer.shop

import behavioral.observer.manager.EventManager

class Shop {

    val events = EventManager()

    fun presentPhone() {
        events.notify("New phone presented!")
    }

    fun presentComputer() {
        events.notify("New computer presented!")
    }
}