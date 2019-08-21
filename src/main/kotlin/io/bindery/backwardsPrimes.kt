package io.bindery

fun backwardsPrime(start: Long, end: Long): String {
    val primesInRange = Prime.getSetOfPrimesInRange(start..end)

    val backwardsPrimes = primesInRange.filter { prime ->
        val backwardsPrime = prime.toString().reversed().toLong()
        val isNotPalindrome = backwardsPrime != prime

        isNotPalindrome && Prime.isPrime(backwardsPrime)
    }

    return backwardsPrimes.joinToString(" ")
}
