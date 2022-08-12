package com.example.belajarkotlin.generic

fun displayLength(array: Array<*>) {
    println("Total Array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Jabar", "Syahrial", "Reza")

    displayLength(arrayInt)
    displayLength(arrayString)
}