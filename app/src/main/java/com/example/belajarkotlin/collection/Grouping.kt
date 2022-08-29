package com.example.belajarkotlin.collection
//berfungsi untuk menggrouping sesuai key nya dan bisa di setting key map nya.
fun main() {
    val list = listOf("a", "b", "c", "a", "b", "c", "d", "aa", "aa", "bb", "abc")
    val map: Map<String, List<String>> = list.groupBy { it }

    println(map)
    val map2: Map<Int, List<String>> = list.groupBy { it.length }

    println(map2)
    val grouping: Grouping<String, String> = list.groupingBy { it }

    println(grouping)
}