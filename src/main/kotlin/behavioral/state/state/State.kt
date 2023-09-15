package behavioral.state.state

import behavioral.state.player.Player

/**
 * Общий интерфейс всех состояний.
 *
 * Контекст передаёт себя в конструктор состояния, чтобы состояние могло
 * обращаться к его данным и методам в будущем, если потребуется. Например, чтобы менять состояние.
 */
abstract class State(player: Player) {
    abstract fun onLock()
    abstract fun onPlay()
    abstract fun onNext()
    abstract fun onPrevious()
}