package com.example.belajarkotlin.function

import com.example.belajarkotlin.oop.User

fun main() {
    val user = User("Jabar","Rahasia")

    user.let {
        println(it.username)
        println(it.password)
    }

    user.run {
        println(this.username)
        println(this.password)
    }

}