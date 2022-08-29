package com.example.belajarkotlin.collection

//TODO list default nya immutable yaitu datanya tidak bisa di rubah
fun main() {
    val list: List<String> = listOf("Jabar", "Syahrial", "Reza")


    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Reza"))
    println(list.indexOf("Tidak ada"))
    println(list.contains("Reza"))
    println(list.contains("Tidak ada"))
    println(list.containsAll(listOf("Jabar", "Reza")))
    println(list.isEmpty())
    println(list.isNotEmpty())

}