package `object`.chapter02.model.policy

import `object`.chapter02.model.Money
import `object`.chapter02.model.Screening
import `object`.chapter02.model.condition.DiscountCondition

/**
 * 정액 할인정책 (금액)
 */
class DiscountAmountPolicy(
    private val discountAmount: Money, // 할인요금
    override val conditions: List<DiscountCondition>
): DefaultDiscountPolicy(conditions) {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}