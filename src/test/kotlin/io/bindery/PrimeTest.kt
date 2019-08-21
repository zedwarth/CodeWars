package io.bindery

import kotlin.test.Test
import kotlin.test.assertEquals

class PrimeTest {
    @Test
    fun sevenIsPrime() {
        assert(Prime.isPrime(7))
    }

    @Test
    fun nineThousandNineHundredAndTwentyThreeIsPrime() {
        assert(Prime.isPrime(9923))
    }

    @Test
    fun zeroIsNotPrime() {
        assert(!Prime.isPrime(0))
    }

    @Test
    fun oneIsNotPrime() {
        assert(!Prime.isPrime(1))
    }

    @Test
    fun sixThousandSixHinderedAndSixtySixIsNotPrime() {
        assert(!Prime.isPrime(6666))
    }

    @Test
    fun getSetOfPrimesInRange() {
        val actual = Prime.getSetOfPrimesInRange(1..550L)

        val expected = mutableSetOf(2L, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 ,167, 173, 179, 181,
                191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293,
                307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421,
                431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547)

        assertEquals(expected, actual)
    }

    @Test
    fun getsSetOfPrimesInHighRange() {
        val actual = Prime.getSetOfPrimesInRange(70000..70245L)

        val expected = mutableSetOf(70001, 70003, 70009, 70019, 70039, 70051, 70061, 70067, 70079, 70099, 70111, 70117,
                70121, 70123, 70139, 70141, 70157, 70163, 70177, 70181, 70183, 70199, 70201, 70207, 70223, 70229, 70237,
                70241L)

        assertEquals(expected, actual)
    }
}
