package `object`.chapter02.model

import java.math.BigDecimal

class Money(
    private val amount: BigDecimal
) {

    companion object {
        val ZERO = wons(0)

        fun wons(amount: Double): Money {
            return Money(BigDecimal.valueOf(amount))
        }

        fun wons(amount: Long): Money {
            return Money(BigDecimal.valueOf(amount))
        }
    }

    fun minus(amount: Money): Money {
        return Money(this.amount.subtract(amount.amount))
    }

    fun times(count: Int): Money {
        return Money(this.amount.multiply(BigDecimal.valueOf(count.toLong())))
    }

    fun times(percent: Double): Money {
        return Money(this.amount.multiply(BigDecimal.valueOf(percent)))
    }

    fun plus(amount: Money): Money {
        return Money(this.amount.plus(amount.amount))
    }

    fun getAmount(): BigDecimal {
        return this.amount
    }
}