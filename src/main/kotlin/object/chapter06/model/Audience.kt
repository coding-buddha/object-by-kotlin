package `object`.chapter06.model

import `object`.chapter01.model.Ticket

class Audience(
    private val bag: Bag
) {

    fun buy(ticket: Ticket): Long {
        return bag.hold(ticket)
    }
}