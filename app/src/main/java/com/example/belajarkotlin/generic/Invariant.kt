package com.example.belajarkotlin.generic

class Invariant <T>(val data:T)

fun main() {
    val invariantString=Invariant("String")
//    val invariantAny:Invariant<Any> = invariantString //bisa
//    invariantAny.data = 100 //bahaya

}
