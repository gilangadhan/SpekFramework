package com.dicoding.picodiploma.unittesting

import org.junit.Assert
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

@RunWith(JUnitPlatform::class)
class CalculatorSpek : Spek({
    describe("a calculator") {
        val calculator = SampleCalculator()

        context("addition") {
            val sum = calculator.sum(2, 4)

            it("should return the result of adding the first number to the second number") {
                Assert.assertEquals(6, sum)
            }
        }

        context("subtraction") {
            val subtract = calculator.subtract(4, 2)

            it("should return the result of subtracting the second number from the first number") {
                Assert.assertEquals(2, subtract)
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