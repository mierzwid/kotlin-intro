package kotlin_intro

val names = listOf(
    "Michal Zebrowski",
    "Wojciech Duryasz",
    "Waldemar Kownacki",
    "Maciej Lagodzinski",
    "Maciej Kozlowski",
    "Lech Lotocki",
    "Andrzej Szenajch",
    "Jaroslaw Nowikowski",
    "Arkadiusz Janiczek"
)

val roles = listOf(
    "Geralt",
    "Stary wiedzmin",
    "Ojciec Geralta",
    "Maly Geralt",
    "Gwido / Falwick",
    "Kaplan Jarrow",
    "Druid",
    "Gascaden",
    "Clovis"
)

open class Person(val firstName: String, val lastName: String, val role: String){
    override fun toString() = "$lastName $firstName as $role"
}

class Witcher(firstName: String, lastName: String, role: String) : Person(firstName, lastName, role) {
    override fun toString() = "${super.toString()} A WITCHER!"
}

fun main() {
    val cast= names.map{ it.split (" ") }.map{ it[0] to it[1] }.zip(roles) { actor, role -> when(role) {
        "Geralt" -> Witcher(actor.first, actor.second, role)
        "Stary wiedzmin" -> Witcher(actor.first, actor.second, role)
        else -> Person(actor.first, actor.second, role)
    }}
    cast.forEach { println(it)}
}

//Zebrowski Michal as Geralt A WITCHER!
//Duryasz Wojciech as Stary wiedzmin A WITCHER!
//Kownacki Waldemar as Ojciec Geralta
//Lagodzinski Maciej as Maly Geralt
//Kozlowski Maciej as Gwido / Falwick
//Lotocki Lech as Kaplan Jarrow
//Szenajch Andrzej as Druid
//Nowikowski Jaroslaw as Gascaden
//Janiczek Arkadiusz as Clovis