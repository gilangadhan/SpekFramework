package com.dicoding.picodiploma.unittesting

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith

@RunWith(JUnitPlatform::class)
class CalculatorSpek : Spek({
    describe("a calculator") {
        val calculator = SampleCalculator()

        on("addition") {
            val sum = calculator.sum(2, 4)

            it("should return the result of adding the first number to the second number") {
                assertEquals(6, sum)
            }
        }

        on("subtraction") {
            val subtract = calculator.subtract(4, 2)

            it("should return the result of subtracting the second number from the first number") {
                assertEquals(2, subtract)
            }
        }
    }
})

class SampleCalculator {
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun subtract(x: Int, y: Int): Int {
        return x - y
    }
}