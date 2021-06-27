package `object`.chapter02.model.policy

import `object`.chapter02.model.Money
import `object`.chapter02.model.Screening
import `object`.chapter02.model.condition.DiscountCondition

/**
 * 정률 할인정책 (퍼센트)
 */
class DiscountPercentPolicy(
    private val percent: Double,
    override val conditions: List<DiscountCondition>
): DefaultDiscountPolicy(conditions) {

    override fun getDiscountAmount(screening: Screening): Money {
        return screening.getMovieFee().times(percent)
    }
}