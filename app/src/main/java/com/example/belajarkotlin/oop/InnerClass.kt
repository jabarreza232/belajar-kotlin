package com.example.belajarkotlin.oop

class Boss(val name: String) {

    inner class Employee(val name: String) {
        fun hi() {
            println("Hi ny name is $name, my boss name ${this@Boss.name}")
        }
    }
}