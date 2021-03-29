package chapter02.model.policy

import chapter02.model.Money
import chapter02.model.Screening
import chapter02.model.condition.DiscountCondition

/**
 * 정액 할인정책 (금액)
 */
class DiscountAmountPolicy(
    private val discountAmount: Money, // 할인요금
    override val conditions: List<DiscountCondition>
): DiscountPolicy {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }
}