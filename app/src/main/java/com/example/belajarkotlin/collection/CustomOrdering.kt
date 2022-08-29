package com.example.belajarkotlin.collection


data class Fruit(val name: String, val quantity: Int)

fun main() {
    val fruits = listOf(Fruit("Apple", 10), Fruit("Orange", 5), Fruit("Banana", 7))
    println(fruits.sortedBy { it.name })
    println(fruits.sortedBy { it.quantity })

    println(fruits.sortedByDescending { it.name })
    println(fruits.sortedByDescending { it.quantity })

    println(fruits.sortedWith { fruit1, fruit2 ->
        fruit1.quantity.compareTo(fruit2.quantity)
    })

}