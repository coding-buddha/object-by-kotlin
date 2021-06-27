package chapter01.model

class AdvancedAudience(
    private val bag: AdvancedBag
) {

    fun buy(ticket: Ticket): Long {
        return bag.insert(ticket)
    }
}