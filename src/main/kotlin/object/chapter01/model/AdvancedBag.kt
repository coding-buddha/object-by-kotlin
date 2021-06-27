package chapter01.model

class AdvancedBag(
    private var amount: Long,
    private var ticket: Ticket? = null,
    private val invitation: Invitation? = null
) {

    fun insert(ticket: Ticket): Long {
        return when(invitation != null) {
            true -> {
                this.ticket = ticket
                0L
            }
            else -> {
                this.ticket = ticket
                amount -= ticket.fee
                ticket.fee
            }
        }
    }
}