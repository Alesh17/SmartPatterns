package behavioral.state.player

import behavioral.state.state.ReadyState
import behavioral.state.state.State

/** Контекст (проигрыватель). */
class Player {

    private var state: State
    private var isPlaying = false

    init {
        state = ReadyState(this)
        isPlaying = true
    }

    fun isPlaying() = isPlaying
    fun getState() = state

    fun changeState(state: State) {
        this.state = state
    }

    fun start() {
        print("Playing")
    }

    fun next() {
        print("Next")
    }

    fun prev() {
        print("Previous")
    }
}