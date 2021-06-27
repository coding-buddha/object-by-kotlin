package `object`.chapter01.model

class AdvancedTheater(
    private val ticketSeller: AdvancedTicketSeller
) {
    fun enter(audience: AdvancedAudience): Unit {
        ticketSeller.sellTo(audience)
    }
}