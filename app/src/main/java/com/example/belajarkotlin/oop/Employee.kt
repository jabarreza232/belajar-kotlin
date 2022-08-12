package com.example.belajarkotlin.oop

abstract class Employee(val name: String) {
    abstract val work: String
    abstract fun sayHello(name: String)
    abstract fun work(name: String)

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return name.equals(other)
    }

}
class Manager(name: String, override val work: String="Manage") : Employee(name) {



    override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")

    }

    override fun work(name: String) {
        TODO("Not yet implemented")
    }

}

class VicePresident(name: String, override val work: String="Monitor") : Employee(name) {
    override fun sayHello(name: String) {

        println("Hello $name, My name is Vice President ${this.name}")
    }

    override fun work(name: String) {
        TODO("Not yet implemented")
    }
}