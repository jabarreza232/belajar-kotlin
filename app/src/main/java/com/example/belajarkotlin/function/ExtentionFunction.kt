package com.example.belajarkotlin.function

fun main() {
    val hello: String = "Jabar".hello()
    println(hello)
}

fun String.hello(): String = "Hello $this"