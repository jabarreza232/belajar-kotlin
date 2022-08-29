package com.example.belajarkotlin.collection

fun main() {
    val list1: List<String> = listOf("Eko", "Kurniawan", "Khannedy")
    val list2: List<String> = listOf("Programmer", "Zaman", "Now")

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3)


    val list4 = list1.zip(list2) { item1, item2 ->
        "$item1 $item2"
    }

    println(list4)

}