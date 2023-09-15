package behavioral.state.state

import behavioral.state.player.Player

class ReadyState(private val player: Player) : State(player) {

    override fun onLock() {
        player.changeState(LockedState(player))
    }

    override fun onPlay() {
        player.start()
        player.changeState(PlayingState(player))
    }

    override fun onNext() = Unit

    override fun onPrevious() = Unit
}