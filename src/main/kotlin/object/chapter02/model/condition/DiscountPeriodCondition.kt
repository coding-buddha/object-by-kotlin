package chapter02.model.condition

import chapter02.model.Screening
import java.time.DayOfWeek
import java.time.LocalTime

class DiscountPeriodCondition(
    private val dayOfWeek: DayOfWeek,
    private val startTime: LocalTime,
    private val endTime: LocalTime
) : DiscountCondition {

    /**
     * 상영요일이 동일 && 상영의 시작시간과 종료시간 사이 여부
     */
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().dayOfWeek.equals(dayOfWeek)
                && startTime <= screening.getStartTime().toLocalTime()
                && endTime >= screening.getStartTime().toLocalTime()
    }
}