package com.example.belajarkotlin.collection

//untuk mengambil data acak dari sebuah collection
fun main() {
    val numbers = (1..100).toList()

    println(numbers.random())
    println(numbers.random())
    println(numbers.random())
    println(numbers.random())
    println(numbers.random())

}