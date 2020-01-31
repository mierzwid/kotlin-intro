package kotlin_intro.exercises

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class Exercise2Test : StringSpec({
    "should generate Witchers cast" {
        //given
        val names = listOf(
            "Michal Zebrowski",
            "Wojciech Duryasz",
            "Waldemar Kownacki",
            "Maciej Lagodzinski",
            "Maciej Kozlowski",
            "Lech Lotocki",
            "Andrzej Szenajch",
            "Jaroslaw Nowikowski",
            "Arkadiusz Janiczek",
            "Zbigniew Zamachowski"
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
            "Clovis",
            "Jaskier"
        )

        //when
        val result = generateCast(names, roles)
        result shouldBe """
            Zebrowski Michal as Geralt A WITCHER!
            Duryasz Wojciech as Stary wiedzmin A WITCHER!
            Kownacki Waldemar as Ojciec Geralta
            Lagodzinski Maciej as Maly Geralt
            Kozlowski Maciej as Gwido / Falwick
            Lotocki Lech as Kaplan Jarrow
            Szenajch Andrzej as Druid
            Nowikowski Jaroslaw as Gascaden
            Janiczek Arkadiusz as Clovis
            Zamachowski Zbigniew as Jaskier A BARD!
        """.trimIndent()
    }
})