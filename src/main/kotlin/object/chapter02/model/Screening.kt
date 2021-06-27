package `object`.chapter02.model

import java.time.LocalDateTime

/**
 * 상영 도메인
 */
class Screening(
    private val movie: Movie,
    private val sequence: Int,
    private val whenScreened: LocalDateTime
) {

    fun reserve(customer: Customer, audienceCount: Int): Reservation {
        return Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }

    private fun calculateFee(audienceCount: Int): Money {
        return movie.calculateMovieFee(this).times(audienceCount)
    }

    // 순번의 일치 여부
    fun isSequence(sequence: Int): Boolean {
        return this.sequence == sequence
    }

    // 영화의 기본 요금 반환
    fun getMovieFee(): Money {
        return this.movie.fee
    }

    fun getStartTime(): LocalDateTime {
        return this.whenScreened
    }
}