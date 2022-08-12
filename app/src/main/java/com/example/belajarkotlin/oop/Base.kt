package com.example.belajarkotlin.oop

interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodBye(name: String) {
        println("Goodbye $name")
    }
}

class DelegateBase(val base: Base) : Base by base