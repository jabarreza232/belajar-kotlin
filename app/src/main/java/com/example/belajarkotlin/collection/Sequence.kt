package com.example.belajarkotlin.collection
//Dibutuhkan ketika menemukan data collection nya besar dan menggunakan logic yang kompleks
fun main() {


    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    //non sequence
    val result = words
        .filter {
            println("filter:$it")
            it.length > 3
        }
        .map {
            println("map:$it")
            it.uppercase()
        }.take(4)

    println(result)


    println("===========")

    //sequence operasi nya di eksekusi ketika di butuhkan saja

    val sequence = words.asSequence()

    val resultSequence = sequence
        .filter {
            println("filter:$it")
            it.length > 3
        }
        .map {
            println("map:$it")
            it.uppercase()
        }.take(4)
    println(resultSequence.toList())

}