package behavioral.strategy.strategy

class CryptoStrategy : PayStrategy {

    override fun pay(amount: Int): Boolean {
        /* Оплата с помощью криптовалюты... */
        return true
    }
}