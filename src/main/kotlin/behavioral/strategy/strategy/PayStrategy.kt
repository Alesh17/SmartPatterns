package behavioral.strategy.strategy

interface PayStrategy {
    fun pay(amount: Int): Boolean
}