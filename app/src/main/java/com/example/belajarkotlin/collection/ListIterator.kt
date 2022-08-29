package com.example.belajarkotlin.collection

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("Display next")
    while (listIterator.hasNext()) {
        println(listIterator.next())
    }

    println("Display previous")
    while (listIterator.hasPrevious()) {
        println(listIterator.previous())
    }
}

fun main() {
    println(displayListIterator(listOf("Eko", "Kurniawan").listIterator()))
}