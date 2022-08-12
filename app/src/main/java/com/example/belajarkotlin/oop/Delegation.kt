package com.example.belajarkotlin.oop

fun main() {

    val myBase = MyBase()
    val delegateBase= DelegateBase(myBase)
    delegateBase.sayHello("Jabar")
    delegateBase.sayGoodBye("Reza")



}