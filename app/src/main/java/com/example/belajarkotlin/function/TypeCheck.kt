package com.example.belajarkotlin.function

import com.example.belajarkotlin.oop.Car
import com.example.belajarkotlin.oop.Manager

fun main() {
    println(printObject(Car("toyota")))
    println(printObject(Manager("Jabar")))
    println(printString(1))
    println(printString("Tes"))
}

fun printObject(any: Any) {
    when (any) {
        is Car -> println("${any.brand}")
        is Manager -> println("${any.name}")
        else -> println(any)
    }
//    if (any is Car) {
//        println("${any.brand}")
//    } else if (any is Employee) {
//        println("${any.name}")
//    } else {
//        println(any)
//    }
}
fun printString(any:Any){
//    val value= any as String
    val values:String?= any as? String //bisa null
    println(values)
}