package com.github.hoppjan.katas.helloworld

fun hello(name: String = "World") = "Hello $name!"

fun hello(names: Array<String>) =
    if (names.isNotEmpty())
        hello(names.joinToString(separator = " "))
    else hello()
