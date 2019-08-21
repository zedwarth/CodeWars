package io.bindery

import kotlin.test.Test
import kotlin.test.assertEquals

internal class BackwardsPrimesKtTest {
    @Test fun twoToOneHundred() {
        val actual = backwardsPrime(2, 100)
        val expected = "13 17 31 37 71 73 79 97"

        assertEquals(expected, actual)
    }

    @Test fun nineThousandNineHundredToTenThousand() {
        val actual = backwardsPrime(9900, 10000)
        val expected = "9923 9931 9941 9967"

        assertEquals(expected, actual)
    }

    @Test fun testThree() {
        val actual = backwardsPrime(7000, 7100)
        val expected = "7027 7043 7057"

        assertEquals(expected, actual)
    }

    @Test
    fun backWardsPrime2() {
        assertEquals("70001 70009 70061 70079 70121 70141 70163 70241", backwardsPrime(70000, 70245))
    }
}
