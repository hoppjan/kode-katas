package com.github.hoppjan.katas.fizzbuzz

fun fizzBuzz(dividend: Int) = buildString {
    if (dividend.rem(3) == 0)
        append("fizz")
    if (dividend.rem(5) == 0)
        append("buzz")
    if (isEmpty())
        append(dividend)
}
