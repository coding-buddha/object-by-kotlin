package chapter02.model

import chapter02.model.policy.DiscountPolicy
import java.time.Duration

class Movie(
    private val title: String,
    private val runningTime: Duration,
    val fee: Money,
    private val discountPolicy: DiscountPolicy
) {

    // 1인당 예매 요급을 반환
    fun calculateMovieFee(screening: Screening): Money {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening))
    }
}