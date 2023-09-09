package behavioral.observer.manager

import behavioral.observer.listener.EventListener

class EventManager {

    private var listeners: MutableList<EventListener> = mutableListOf()

    fun subscribe(listener: EventListener) {
        listeners.add(listener)
    }

    fun unsubscribe(listener: EventListener) {
        listeners.remove(listener)
    }

    fun notify(message: String) {
        for (listener in listeners) {
            listener.listen(message)
        }
    }
}