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
}
