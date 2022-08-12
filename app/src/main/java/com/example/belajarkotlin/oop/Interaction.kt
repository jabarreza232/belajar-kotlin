package com.example.belajarkotlin.oop

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Go {
    fun go()
}

interface MoveA{
    fun move()= println("Move A")
}
interface MoveB{
    fun move()= println("Move B")
}
open class Contoh()

class Human(override val name: String) : Contoh(), Interaction, Go,MoveA,MoveB {
    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun go() {
        TODO("Not yet implemented")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()

    }
}