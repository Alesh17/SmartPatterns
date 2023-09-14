package behavioral.snapshot.snapshot

class EditorSnapshot(
    private val state: Int,
) : Snapshot {

    override fun getState(): Int = state
}