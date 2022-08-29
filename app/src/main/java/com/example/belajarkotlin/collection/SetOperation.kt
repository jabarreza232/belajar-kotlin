package com.example.belajarkotlin.collection

fun main() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()

    //semua datanya menjadi unik
    println(number1.union(number2))

    //mengambil data yang kedua set nya ada.
    println(number1.intersect(number2))

    //mengambil data number1 yang tidak ada number 2
    println(number1.subtract(number2))
    println(number2.subtract(number1))
}