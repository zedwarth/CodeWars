package io.bindery

class PrimeSieve {
    val setOfPrimes: MutableSet<Long> = setOf(2L).toMutableSet()

    override fun toString(): String {
        return setOfPrimes.toString()
    }

    fun findPrimes(limit: Long) {
        while (greatestKnownPrime() < limit) {
            findNextPrime()
        }
    }

    private fun findNextPrime() {
        val nextInteger = setOfPrimes.max()!!.inc()
        val nextPrime = findNextPrime(nextInteger)

        setOfPrimes.add(nextPrime)
    }

    private fun findNextPrime(i: Long): Long {
        return when {
            isNumberPrime(i) -> i
            else -> findNextPrime(i + 1)
        }
    }
    private fun greatestKnownPrime(): Long {
        return setOfPrimes.max() ?: 2
    }

    private fun isNumberPrime(number: Long): Boolean {
        for (prime in setOfPrimes) {
            if (number % prime == 0L) return false
        }
        return true
    }
}
