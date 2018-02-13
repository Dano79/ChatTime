package drizzidevs.chattime.Model

/**
 * Created by danielodorizzi on 2/13/18.*
 */
class Channel (val name: String, val description: String, val id: String) {
    override fun toString(): String {
        return "#$name"

    }
}