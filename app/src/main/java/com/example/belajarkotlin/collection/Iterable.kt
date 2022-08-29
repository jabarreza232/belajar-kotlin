package com.example.belajarkotlin.collection

fun <T> displayIterable(iterable: Iterable<T>) {

    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayIterable(listOf("Eko", "Kurniawan"))
    displayIterable(setOf("Eko", "Kurniawan"))
}


