package io.bindery

import io.bindery.NumberIPAddress.Companion.numberAndIPAddress
import org.junit.Test
import kotlin.test.assertEquals


internal class NumberIPAddressTest {
    @Test
    fun testFixed() {
        assertEquals("167773121", numberAndIPAddress("10.0.3.193"))
        assertEquals("10.3.3.193", numberAndIPAddress("167969729"))
    }
}
