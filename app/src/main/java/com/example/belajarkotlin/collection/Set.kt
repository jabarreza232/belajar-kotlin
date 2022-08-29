package com.example.belajarkotlin.collection

fun main() {
    val set: Set<Person> =
        setOf(Person("Jabar"), Person("Syahrial"), Person("Jabar"), Person("Reza"))
    println(set.size)
    println(set.contains(Person("Jabar")))

    for (person in set) {
        println(person)
    }

}

class Person(val name: String) {

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Person -> name == other.name
        else -> false
    }

    override fun toString(): String {
        return "Person with name $name"
    }
}