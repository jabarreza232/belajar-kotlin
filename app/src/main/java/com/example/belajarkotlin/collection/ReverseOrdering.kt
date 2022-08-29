package com.example.belajarkotlin.collection
//order reverse membuat collection baru jadi tidak merubah data lama nya
// order asreverse mengambil data collection lama jika collection lama merubah data maka otomatis ikut berubah

fun main() {
    val list1 = mutableListOf("Eko", "Kurniawan", "Khannedy")
    val listReversed = list1.reversed()
    val listAsReversed = list1.asReversed()

    println(listReversed)
    println(listAsReversed)

    list1.add("Programmer")

    println(listReversed)
    println(listAsReversed)


}