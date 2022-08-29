package com.example.belajarkotlin.collection

fun main() {
    setOf("Eko", "Kurniawan").forEach {
        println(it)
    }
    mutableSetOf("Eko", "Kurniawan").forEachIndexed { index, value ->
        println("$index : $value")
    }


}