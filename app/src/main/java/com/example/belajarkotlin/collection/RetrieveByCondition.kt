package com.example.belajarkotlin.collection

fun main() {
    val numbers = (1..20).toList()
    println(numbers.first { it > 10 })
    println(numbers.last { it > 10 })

    println(numbers.firstOrNull { it > 50 })//bisa null
    println(numbers.lastOrNull { it > 50 })//bisa null

    println(numbers.find { it > 50 })//bisa null
    println(numbers.findLast { it > 50 })//bisa null
}