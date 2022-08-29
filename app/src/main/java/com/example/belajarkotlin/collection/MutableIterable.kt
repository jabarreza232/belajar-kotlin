package com.example.belajarkotlin.collection

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) {
        val value = iterator.next()
//        iterator.remove() untuk menghapus datanya
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Eko", "Kurniawan"))
    displayMutableIterable(mutableSetOf("Eko", "Kurniawan"))
}