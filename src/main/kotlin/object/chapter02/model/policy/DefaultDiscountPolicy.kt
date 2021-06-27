package chapter02.model.policy

import chapter02.model.Money
import chapter02.model.Screening
import chapter02.model.condition.DiscountCondition

/**
 * 할인정책
 * - 정률 할인 정책 (퍼센트)
 * - 정액 할인 정책 (금액)
 */
abstract class DefaultDiscountPolicy(
    override val conditions: List<DiscountCondition>
): DiscountPolicy {

    override fun calculateDiscountAmount(screening: Screening): Money {
        for (condition in this.conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }

        return Money.ZERO
    }

    abstract override fun getDiscountAmount(screening: Screening): Money
}