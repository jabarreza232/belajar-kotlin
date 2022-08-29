package com.example.belajarkotlin.collection

fun main() {
    val numbers = (1..100).toList()

    val max = numbers.reduce { first, second ->
        println("$first and $second")
        if (first > second) first
        else second
    }

    println(max)

    val min = numbers.reduce { first, second ->
        if (first < second) first else second
    }
    println(min)

    val sum = numbers.fold(0) { first, second ->

        first + second
    }

    println(sum)
    println(numbers.sum())

    val names = listOf("Eko", "Kurniawan", "Khannedy")
    val count = names.fold(0) { first, second ->
        first + 1
    }

    println(count)
    println(names.count())

}