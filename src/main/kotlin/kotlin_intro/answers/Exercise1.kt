package kotlin_intro.answers

import kotlin.math.sqrt

fun fib(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> fib(n - 1) + fib(n - 2)
}

fun isPrime(number: Int) = if (number < 2) {
    false
} else {
    (2 until sqrt(number.toDouble()).toInt() ).none { number % it == 0 }
}
