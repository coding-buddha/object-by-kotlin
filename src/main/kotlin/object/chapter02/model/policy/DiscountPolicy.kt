package `object`.chapter02.model.policy

import `object`.chapter02.model.Money
import `object`.chapter02.model.Screening
import `object`.chapter02.model.condition.DiscountCondition

/**
 * 할인정책
 * - 정률 할인 정책 (퍼센트)
 * - 정액 할인 정책 (금액)
 */
interface DiscountPolicy {

    val conditions: List<DiscountCondition>

    fun calculateDiscountAmount(screening: Screening): Money {
        for (condition in this.conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    fun getDiscountAmount(screening: Screening): Money
}