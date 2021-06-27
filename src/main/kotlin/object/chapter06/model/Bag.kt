package `object`.chapter06.model

import `object`.chapter01.model.Invitation
import `object`.chapter01.model.Ticket

class Bag(
    private var amount: Long,
    private var ticket: Ticket? = null,
    private val invitation: Invitation? = null
) {

    fun hold(ticket: Ticket): Long {
        if (this.hasInvitation()) {
            this.setTicket(ticket)
            return 0L
        }

        this.setTicket(ticket)
        this.minusAmount(ticket.fee)
        return ticket.fee
    }

    private fun hasInvitation(): Boolean {
        return this.invitation == null
    }

    private fun setTicket(ticket: Ticket) {
        this.ticket = ticket
    }

    private fun minusAmount(amount: Long) {
        this.amount -= amount
    }
}