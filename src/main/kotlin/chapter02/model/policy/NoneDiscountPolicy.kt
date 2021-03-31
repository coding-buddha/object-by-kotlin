package chapter02.model.policy

import chapter02.model.Money
import chapter02.model.Screening
import chapter02.model.condition.DiscountCondition

class NoneDiscountPolicy(
    override val conditions: List<DiscountCondition> = listOf()
): DiscountPolicy {

    override fun getDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}