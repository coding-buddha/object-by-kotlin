package chapter02.model.percent

import chapter02.model.Money
import chapter02.model.Screening
import chapter02.model.condition.DiscountCondition

class DiscountAmountPolicy(
    override val conditions: MutableList<DiscountCondition>
): DiscountPolicy {

    override fun getDiscountAmount(screening: Screening): Money {
        TODO("Not yet implemented")
    }
}