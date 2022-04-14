package com.github.hoppjan.katas.fizzbuzz

fun fizzBuzz(dividend: Int) = buildString {
    if (dividend isDivisibleBy 3)
        append("fizz")
    if (dividend isDivisibleBy 5)
        append("buzz")
    if (isEmpty())
        append(dividend)
}

private infix fun Int.isDivisibleBy(divisor: Int) = rem(divisor) == 0
