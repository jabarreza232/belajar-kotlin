package com.example.belajarkotlin.collection
//setiap ekstensi function di dalam collection itu aman di karenakan tidak merubah data aslinya
//ordering ascending dan descending
fun main() {
    val numbers = listOf(1,4,3,2,5,6,7,9)

    val sortedAsc = numbers.sorted()
    val sortedDesc = numbers.sortedDescending()

    println(sortedAsc)
    println(sortedDesc)
}