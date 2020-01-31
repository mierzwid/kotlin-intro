package kotlin_intro.exercises

import io.kotlintest.data.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class Exercise1Test : StringSpec({
    "check Fibonacci numbers" {
        //given
        forall(
            row(0, 0),
            row(1, 1),
            row(2, 1),
            row(3, 2),
            row(4, 3),
            row(5, 5),
            row(6, 8),
            row(7, 13),
            row(8, 21),
            row(19, 4181)
        ) { number, fibNumber ->

            //when
            val result = fib(number)

            //then
            result shouldBe fibNumber
        }
    }

    "check prime numbers" {
        //given
        forall(
            row(1, false),
            row(2, true),
            row(3, true),
            row(5, true),
            row(63, false),
            row(97, true)
        ) { number, isPrime ->

            //when
            val result = isPrime(number)

            //then
            result shouldBe isPrime
        }
    }
})
