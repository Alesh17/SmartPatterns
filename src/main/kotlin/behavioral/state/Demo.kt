package behavioral.state

import behavioral.state.player.Player

/**
 * State (Состояние) — это поведенческий паттерн, позволяющий динамически изменять поведение объекта при смене его состояния.
 * Поведения, зависящие от состояния, переезжают в отдельные классы. Первоначальный класс (контекст) хранит ссылку
 * на один из таких объектов-состояний и делегирует ему работу.
 */
object Demo {

    fun main() {
        val player = Player()
        player.getState().onPlay()
        player.getState().onLock()
        player.getState().onNext()
        player.getState().onPrevious()
    }
}