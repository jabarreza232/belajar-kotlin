package com.example.belajarkotlin.collection
//berfungsi untuk memotong beberapa bagian sesuai jumlah data collection ke dalam collection

fun main() {
    val numbers = (1..100).toList()
    val list1= numbers.chunked(10)
    println(list1.size)
    println(list1)
    val list2= numbers.chunked(10) { values ->
        var total =0
        values.forEach{
            total+=it
        }
        total
    }

    println(list2)
}