package com.example.belajarkotlin.collection


fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Eko" to "Programmer",
        "Kurniawan" to "Zaman",
        "Khannedy" to "Now"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()

    val (list1, list2) = list.unzip()

    println(list1)
    println(list2)


}