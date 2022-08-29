package com.example.belajarkotlin.collection
//function collection untuk pengecekan data ada atau tidak.
fun main() {
    val numbers = (1..10).toSet()
    println(numbers.contains(5))
    println(numbers.containsAll(listOf(1, 2, 3, 11)))
    println(numbers.isEmpty())
    println(numbers.isNotEmpty())

}