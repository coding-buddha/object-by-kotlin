package `object`.chapter02.model

/**
 * 예매 도메인
 */
class Reservation(
    private val customer: Customer,
    private val screening: Screening,
    private val money: Money,
    private val audienceCount: Int
) {
}