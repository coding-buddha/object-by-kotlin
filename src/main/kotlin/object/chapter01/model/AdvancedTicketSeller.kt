package `object`.chapter01.model

class AdvancedTicketSeller(
    private val ticketOffice: AdvancedTicketOffice
) {

    fun sellTo(audience: AdvancedAudience) {
        ticketOffice.sellTicketTo(audience)
    }
}