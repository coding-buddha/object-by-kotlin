package `object`.chapter02.model.condition

import `object`.chapter02.model.Screening


/**
 * 할인조건
 */
interface DiscountCondition {

    /**
     * 상영조건에 만족하는지 여부 확인
     */
    fun isSatisfiedBy(screening: Screening): Boolean
}