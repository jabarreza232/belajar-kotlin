package com.example.belajarkotlin.generic

fun main() {
    val function  = Function()
    function.sayHello("Jabar")
    function.sayHello<Int>(12)

    function.sayHello<String>("Reza")

}