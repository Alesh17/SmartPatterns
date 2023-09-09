package behavioral.observer.listener

/** Это просто сущность, которая, кроме своих функций, реализует еще и функцию слушателя (подписчика). */
class UserListener : EventListener {
    override fun listen(message: String) = println("Listened: $message")
}