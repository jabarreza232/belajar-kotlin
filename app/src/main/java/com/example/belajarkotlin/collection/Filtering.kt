package com.example.belajarkotlin.collection
//memfilter setiap item dari collection, dan data default nya tetap utuh

fun main() {
    val list1 = listOf("Eko", "Kurniawan", "Khannedy")
    val list2 = list1.filter { it.length > 5 }
    println(list2)

    val list3 = list1.filterIndexed { index, value -> index % 2 == 0 }
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "Eko", "Kurniawan", 2, null)
    val listString = list4.filterIsInstance<String>()
    println(listString)
    val listInt = list4.filterIsInstance<Int>()
    println(listInt)
    val listNotNull = list4.filterNotNull()
    println(listNotNull)

}