package kotlin_intro.answers

open class Person(val firstName: String, val lastName: String, val role: String) {
    override fun toString() = "$lastName $firstName as $role"
}

class Witcher(firstName: String, lastName: String, role: String) : Person(firstName, lastName, role) {
    override fun toString() = "${super.toString()} A WITCHER!"
}

class Bard(firstName: String, lastName: String, role: String) : Person(firstName, lastName, role) {
    override fun toString() = "${super.toString()} A BARD!"
}

fun generateCast(names: List<String>, roles: List<String?>) = names
    .map { it.split(" ") }
    .map { it[0] to it[1] }
    .zip(roles) { actor, role ->
        when (role) {
            "Geralt" -> Witcher(actor.first, actor.second, role)
            "Stary wiedzmin" -> Witcher(actor.first, actor.second, role)
            "Jaskier" -> Bard(actor.first, actor.second, role)
            else -> Person(actor.first, actor.second, role ?: "UNDEFINED")
        }
    }
    .joinToString("\n")
