package io.bindery

import kotlin.math.sqrt

class Prime {
    companion object {
        private val setOfPrimes: MutableSet<Long> = mutableSetOf(2, 3L)

        fun isPrime(number: Long): Boolean {
            if (number < 2) return false

            val limit: Long = sqrt(number.toDouble()).toLong()

            findPrimesTo(limit)

            val sieve = setOfPrimes.intersect(2..limit)

            return sieveOutPrime(number, sieve)
        }

        fun getSetOfPrimesInRange(range: LongRange): Set<Long> {
            return range.filter { isPrime(it) }.toSet()
        }

        private fun sieveOutPrime(number: Long, sieve: Set<Long>): Boolean {
            for (prime in sieve) {
                if (number.rem(prime) == 0L) return false
            }
            return true
        }

        private fun findPrimesTo(limit: Long) {
            if (limit < 2) return

            while (limit !in rangeOfKnownPrimes()) {
                findNextPrime()
            }
        }

        private fun findNextPrime() {
            val nextInteger = greatestKnownPrime() + 2
            val nextPrime = findNextPrime(nextInteger)

            setOfPrimes.add(nextPrime)
        }

        private fun findNextPrime(n: Long): Long {
            return when {
                sieveOutPrime(n, setOfPrimes) -> n
                else -> findNextPrime(n + 1)
            }
        }

        private fun greatestKnownPrime(): Long {
            return setOfPrimes.last()
        }

        private fun rangeOfKnownPrimes(): LongRange {
            return 2..greatestKnownPrime()
        }
    }
}
