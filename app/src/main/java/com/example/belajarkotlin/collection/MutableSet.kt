package com.example.belajarkotlin.collection

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("eko"))
    mutableSet.add(Person("kurniawan"))
    mutableSet.add(Person("khannedy"))
    mutableSet.add(Person("eko"))

    for (person in mutableSet) {
        println(person)
    }
}

