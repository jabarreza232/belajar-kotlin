package com.example.belajarkotlin.collection

fun main() {
    val list = listOf("Eko", "Kurniawan", "Khannedy")
    //cek apakah ada salah satu data lebih dari 5 di dalam list
    println(list.any { it.length > 5 }) //true
    //cek apakah tidak ada salah satu data lebih dari 5 di dalam list
    println(list.none { it.length > 5 }) //false
    //cek apakah semua data lebih dari 5 di dalam list
    println(list.all { it.length > 5 })//false
    //cek apakah tidak ada datanya
    println(list.none())
    //cek apakah ada datanya
    println(list.any())
}