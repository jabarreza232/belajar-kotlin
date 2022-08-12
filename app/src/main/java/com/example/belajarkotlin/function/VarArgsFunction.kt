package com.example.belajarkotlin.function

fun main() {
    test("Jabar","Reza","Syahrial","Keren")
}

fun test(name:String, vararg args:String){
    for(value in args){
        println("Hello $name and $value")
    }
}