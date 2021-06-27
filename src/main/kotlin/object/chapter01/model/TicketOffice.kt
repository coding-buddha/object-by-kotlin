package `object`.chapter01.model

class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket> = mutableListOf()
) {

    fun getTicket(): Ticket {
        if (tickets.size < 0) {
            throw RuntimeException("티켓은 더 이상 존재하지 않습니다.")
        }

        return tickets.removeAt(0)
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}