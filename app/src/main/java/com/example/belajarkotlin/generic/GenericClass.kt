package com.example.belajarkotlin.generic

fun main() {
    val data1:GenericType<String,Int> = GenericType("Jabar",3)
    data1.firstData

    data1.printData()
    val data2:GenericType<Int,Int> = GenericType(2,5)
    data2.printData()

}