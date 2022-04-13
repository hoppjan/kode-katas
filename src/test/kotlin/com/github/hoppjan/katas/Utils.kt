package com.github.hoppjan.katas

import java.io.File

fun readFileLines(name: String) =
    File("src/test/resources", name).readLines()
