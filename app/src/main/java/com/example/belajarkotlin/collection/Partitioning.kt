package com.example.belajarkotlin.collection

fun main() {
    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")
    val pair: Pair<List<String>, List<String>> = list.partition { it.length > 5 }
    val (listMatch, listNotMatch) = pair
    println(listMatch)
    println(listNotMatch)
}