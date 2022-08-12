package com.example.belajarkotlin.function

fun main() {
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro"
        } else {
            "Hello $name"
        }
    }

    fun sayHelloWhen(name: String = ""): String {
        return when (name) {
            ""->"Hello Bro"
            else ->"Hello $name"
        }
    }

    println(sayHelloWhen())
    println(sayHelloWhen("Jabar"))
}