package chapter02.model.percent

import chapter02.model.Money
import chapter02.model.Screening
import chapter02.model.condition.DiscountCondition

/**
 * 할인정책
 * - 정률 할인 정책 (퍼센트)
 * - 정액 할인 정책 (금액)
 */
interface DiscountPolicy {

    val conditions: MutableList<DiscountCondition>

    fun calculateDiscountAmount(screening: Screening): Money {
        for (condition in this.conditions) {
            if (condition.isSatisfieBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    fun getDiscountAmount(screening: Screening): Money
}