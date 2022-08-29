package com.example.belajarkotlin.collection

fun main() {
    val list: List<String> = listOf("Eko", "Kurniawan", "Khannedy")

    val temporary = mutableListOf<String>()

    for (value in list) {
        temporary.add(value.uppercase())
    }

//    val list2 = list.map { value ->
//        value.uppercase()
//    }

    val list2 = list.map {
        it.uppercase()
    }

    val set1 = setOf("Eko", "Kurniawan", "Khannedy")
    val set2 = set1.map {
        it.lowercase()
    }

    println(list2)
    println(set2)

    val names = listOf("Eko", "Budi", "Joko", "Dani", "Andi", "Hendri")
    val namesGanjil = names.mapIndexedNotNull { index, value ->
        if (index % 2 == 0) null else value
    }
    val namesGenap = names.mapIndexedNotNull { index, value ->
        if (index % 2 == 1) null else value
    }

    println(namesGanjil)

    val numbers = (1..100).toList()
    val ganjil = numbers.mapNotNull {
        if (it % 2 == 0) null else it
    }

    println(ganjil)
}