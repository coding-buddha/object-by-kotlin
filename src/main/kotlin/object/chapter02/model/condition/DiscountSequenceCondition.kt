package `object`.chapter02.model.condition

import `object`.chapter02.model.Screening

class DiscountSequenceCondition(
    private val sequence: Int
) : DiscountCondition {

    /**
     * 동일 순번 일치 여부 확인
     */
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(this.sequence)
    }
}