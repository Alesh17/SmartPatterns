package behavioral.state.state

import behavioral.state.player.Player

class PlayingState(private val player: Player) : State(player) {

    override fun onLock() {
        player.changeState(LockedState(player))
    }

    override fun onPlay() {
        player.changeState(ReadyState(player))
    }

    override fun onNext() {
        player.next()
    }

    override fun onPrevious() {
        player.prev()
    }
}