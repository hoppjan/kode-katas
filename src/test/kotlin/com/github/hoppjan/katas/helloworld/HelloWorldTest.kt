package com.github.hoppjan.katas.helloworld

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloWorldTest {

    @Test
    fun `should greet name when name is given`() {
        assertEquals(expected = "Hello hoppjan!", hello("hoppjan"))
    }

    @Test
    fun `should greet world when no name is given`() {
        assertEquals(expected = "Hello World!", hello())
    }

    @Test
    fun `should greet single name given lonely name in array`() {
        assertEquals(
            expected = "Hello hoppjan!",
            actual = com.github.hoppjan.katas.helloworld.hello(arrayOf("hoppjan"))
        )
    }

    @Test
    fun `should greet all given an array of names`() {
        assertEquals(
            expected = "Hello hoppjan & no friends!",
            actual = com.github.hoppjan.katas.helloworld.hello(arrayOf("hoppjan", "&", "no", "friends"))
        )
    }

    @Test
    fun `should greet world given an empty array`() {
        assertEquals(
            expected = "Hello World!",
            actual = com.github.hoppjan.katas.helloworld.hello(arrayOf())
        )
    }
}
