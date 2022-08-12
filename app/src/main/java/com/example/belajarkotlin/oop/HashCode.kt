package com.example.belajarkotlin.oop

fun main() {
    val  employee1 = Manager("Jabar")
    val  employee2 = Manager("Jabar")
    println(employee1.hashCode())
    println(employee2.hashCode())
    println(employee1.hashCode()==employee2.hashCode())

}