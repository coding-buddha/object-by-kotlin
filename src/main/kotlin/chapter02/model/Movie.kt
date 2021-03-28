package chapter02.model

import chapter02.model.percent.DiscountPolicy
import java.time.LocalDateTime

class Movie(
    private val title: String,
    private val runningTime: LocalDateTime,
    val fee: Money,
    private val discountPolicy: DiscountPolicy
) {

    // 1인당 예매 요급을 반환
    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(discountPolicy.calculateDiscount(screening))
    }
}