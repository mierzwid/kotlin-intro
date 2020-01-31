package kotlin_intro.answers

// Calculate Fibonacci number​

fun fib(n: Int): Int {
    if (n == 0 || n == 1) {
        return n
    }
    return fib(n - 1) + fib(n - 2)
}

fun fibKotlinStyle(n: Int): Int = when (n) {
    0, 1 -> n
    else -> fibKotlinStyle(n - 1) + fibKotlinStyle(n - 2)
}


// Check if number is Prime

fun isPrime(n: Int): Boolean {
    if (n < 2) {
        return false
    }
    for (it in 2 until n) {
        if (n % it == 0) {
            return false
        }
    }
    return true
}

fun isPrimeKotlinStyle(n: Int) = if (n < 2) {
    false
} else {
    (2 until n).none { n % it == 0 }
}
