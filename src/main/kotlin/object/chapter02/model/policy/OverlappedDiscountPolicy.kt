package `object`.chapter02.model.policy

import `object`.chapter02.model.Money
import `object`.chapter02.model.Screening
import `object`.chapter02.model.condition.DiscountCondition

/**
 * 중복 할인 정책 (이것저것 섞인 상태)
 */
class OverlappedDiscountPolicy(
    override val conditions: List<DiscountCondition>,
    private val discountPolicies: List<DiscountPolicy>
) : DiscountPolicy {

    override fun getDiscountAmount(screening: Screening): Money {
        val result = Money.ZERO
        discountPolicies.forEach {
            result.plus(it.calculateDiscountAmount(screening))
        }

        return result
    }
}
