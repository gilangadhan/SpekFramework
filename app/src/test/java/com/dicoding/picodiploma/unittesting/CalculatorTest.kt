package com.dicoding.picodiploma.unittesting

import org.junit.Assert
import org.junit.Test

class CalculatorTest {
    private val calculator = SampleCalculator()

    @Test
    fun addition_isCorrect() {
        val sum = calculator.sum(2, 4)
        Assert.assertEquals(6, sum)
    }

    @Test
    fun subtraction_isCorrect() {
        val subtract = calculator.subtract(4, 2)
        Assert.assertEquals(2, subtract)
    }
}

class SampleCalculator {
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun subtract(x: Int, y: Int): Int {
        return x - y
    }
}
