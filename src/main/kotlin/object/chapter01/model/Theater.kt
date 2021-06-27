package `object`.chapter01.model

/**
 * 주체인 소극장
 * - 판매원의 티켓오피스를 직접적으로 접근
 * - 관람객의 가방에 직접적으로 접근
 *
 * 위의 방식으로 하면 안된다. 각각의 객체에 자율성을 높인다.
 */
class Theater(
    private val ticketSeller: TicketSeller
) {

    // 내부적으로 디미터 법칙에 위배된다.
    // 객체의 자율성이 줄어든 상태.
    fun enter(audience: Audience): Unit {
        when (audience.bag.hasInvitation()) {
            true -> {
                val ticket = ticketSeller.ticketOffice.getTicket()
                audience.bag.setTicket(ticket)
            }
            else -> {
                // 초대장이 없으면, 티켓을 판매원에게 구매한 이후에 티켓을 소지할 수 있다.
                val ticket = ticketSeller.ticketOffice.getTicket()
                audience.bag.minusAmount(ticket.fee)
                ticketSeller.ticketOffice.plusAmount(ticket.fee)
                audience.bag.setTicket(ticket)
            }
        }
    }
}