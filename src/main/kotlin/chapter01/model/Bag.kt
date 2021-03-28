package chapter01.model

class Bag(
    private var amount: Long,
    private var ticket: Ticket? = null,
    private val invitation: Invitation? = null
) {

    fun hasInvitation(): Boolean {
        return this.invitation == null
    }

    fun hasTicket(): Boolean {
        return this.ticket == null
    }

    fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }
}