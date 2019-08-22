package io.bindery

import kotlin.Pair

enum class IpAddress {
    OctetQuad,
    Decimal
}

class NumberIPAddress {
    companion object {
        fun numberAndIPAddress(s: String): String {
            return s
        }

        fun parseInputString(input: String): Pair<IpAddress, List<Int>> {
            val decimalMatcher = "\\d{4,}".toRegex().containsMatchIn(input)

            return when {
                decimalMatcher -> Pair(IpAddress.Decimal, listOf(input.toInt()))
                else -> Pair(IpAddress.OctetQuad, input.split('.').map { it.toInt() })
            }
        }
    }
}
