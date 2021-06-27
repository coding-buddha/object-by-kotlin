package chapter01.model

class AdvancedTicketOffice (
    private var amount: Long,
    private val tickets: MutableList<Ticket> = mutableListOf()
) {

    private fun getTicket(): Ticket {
        if (tickets.size < 0) {
            throw RuntimeException("티켓은 더 이상 존재하지 않습니다.")
        }

        return tickets.removeAt(0)
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    private fun plusAmount(amount: Long) {
        this.amount += amount
    }

    /**
     * 해당 구문으로 인해서, TicketOffice 는 audience 에 대한 의존성을 가지게 되었다.
     * 해당 구문을 TicketSeller 로 뺀다면 의존성을 줄어들디만 TicketOffice 의 자율성은 줄어든다.
     * 둘 사이의 적절한 트레이드 오프가 필요하다.
     */
    fun sellTicketTo(audience: AdvancedAudience) {
        plusAmount(audience.buy(getTicket()))
    }
}