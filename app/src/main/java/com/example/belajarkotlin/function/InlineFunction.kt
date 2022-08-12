package com.example.belajarkotlin.function

inline fun hello(firstName:()->String,noinline lastName:()->String):String{
    return "Hello ${firstName()} ${lastName()}"
}
fun main() {
    println(hello({"Jabar"},{"Reza"}))

}