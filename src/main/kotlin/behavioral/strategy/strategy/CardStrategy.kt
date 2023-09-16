package behavioral.strategy.strategy

class CardStrategy : PayStrategy {

    override fun pay(amount: Int): Boolean {
        /* Оплата с помощью банковской карты... */
        return true
    }
}