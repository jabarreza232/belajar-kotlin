package com.example.belajarkotlin.function

fun main() {

    factorialRecursive(10)
}

fun factorialLoop(value: Int): Int {
    var result = 1;
    for (i in value downTo 1) {
        result *= i
        println(result)
    }
    return result
}

fun factorialRecursive(value: Int): Int {
    return if (value == 1) {
        1
    } else {

      value *  factorialRecursive(value - 1)
    }
}

