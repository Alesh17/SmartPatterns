package behavioral.state.state

import behavioral.state.player.Player

class LockedState(private val player: Player) : State(player) {

    override fun onLock() {
        if (player.isPlaying()) player.changeState(ReadyState(player))
    }

    override fun onPlay() {
        player.changeState(ReadyState(player))
    }

    override fun onNext() = Unit

    override fun onPrevious() = Unit
}