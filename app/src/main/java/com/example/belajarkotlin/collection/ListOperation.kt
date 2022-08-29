package com.example.belajarkotlin.collection

fun main() {
    val list = listOf("Eko", "Kurniawan", "Khannedy")

    println(list.getOrNull(10))
    println(list.getOrElse(10) { index -> "Tidak ada" })

    println(list.subList(0, 2))

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Eko"))
    println(sortedList.binarySearch("Khannedy"))
    println(sortedList.binarySearch("Kurniawan"))


    //mengambil urutan index ke berapa. jika ada duplikasi data maka menggunakan lastindexOf untuk mengambil data ke 2
    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)

    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })
    println(numbers.indexOfLast { it > 3 })
}