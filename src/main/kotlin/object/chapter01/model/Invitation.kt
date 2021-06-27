package `object`.chapter01.model

import java.time.LocalDateTime

/**
 * 이벤트 당첨자에게 발송되는 초대장
 */
class Invitation
private constructor(
    private val whenDate: LocalDateTime
) {

    fun getWhenDate(): LocalDateTime {
        return this.whenDate
    }

    companion object {

    }
}