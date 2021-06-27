package chapter02

import `object`.chapter02.model.Money
import `object`.chapter02.model.Movie
import `object`.chapter02.model.condition.DiscountPeriodCondition
import `object`.chapter02.model.condition.DiscountSequenceCondition
import `object`.chapter02.model.policy.DiscountAmountPolicy
import `object`.chapter02.model.policy.DiscountPercentPolicy
import `object`.chapter02.model.policy.NoneDiscountPolicy
import java.time.DayOfWeek
import java.time.Duration
import java.time.LocalTime

fun main() {
    val avatar: Movie = Movie(
        "아바타",
        Duration.ofMinutes(120),
        Money.wons(10000),
        DiscountAmountPolicy(Money.wons(800),
        listOf(
            DiscountSequenceCondition(1),
            DiscountSequenceCondition(10),
            DiscountPeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            DiscountPeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
            )
        ))

    val titanic: Movie = Movie(
        "타이타닉",
        Duration.ofMinutes(180),
        Money.wons(11000),
        DiscountPercentPolicy(0.1,
            listOf(
                DiscountSequenceCondition(2),
                DiscountPeriodCondition(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                DiscountPeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59)),
            )
        ))

    val starWars: Movie = Movie(
        "스타워즈",
        Duration.ofMinutes(210),
        Money.wons(10000),
        NoneDiscountPolicy())
}