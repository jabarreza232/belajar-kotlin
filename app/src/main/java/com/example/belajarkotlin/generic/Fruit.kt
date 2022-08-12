package com.example.belajarkotlin.generic

class Fruit(val name: String, val quantity: Int) : Comparable<Fruit> {

    override fun compareTo(other: Fruit): Int = quantity.compareTo(other.quantity)

}