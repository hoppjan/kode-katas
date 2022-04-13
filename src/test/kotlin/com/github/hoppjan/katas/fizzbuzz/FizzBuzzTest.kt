package com.github.hoppjan.katas.fizzbuzz

import com.github.hoppjan.katas.readFileLines
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun `should give number when 2`() {
        assertEquals(expected = "2", fizzBuzz(2))
    }

    @Test
    fun `should fizz when 3`() {
        assertEquals(expected = "fizz", fizzBuzz(3))
    }

    @Test
    fun `should buzz when 5`() {
        assertEquals(expected = "buzz", fizzBuzz(5))
    }

    @Test
    fun `should fizzbuzz when 15`() {
        assertEquals(expected = "fizzbuzz", fizzBuzz(15))
    }

    @Test
    fun `should fizzbuzz for 1 to 1000`() {
        val solution = readFileLines("fizzbuzz")

        for (i in 1..1000)
            assertEquals(expected = solution[i], fizzBuzz(i))
    }
}
