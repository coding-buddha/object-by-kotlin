package chapter02.model

class Money(
    private val fee: Long
) {

    companion object {
        val ZERO = Money(0L)
    }

    fun minus(calculateDiscount: Any): Money {

    }
}