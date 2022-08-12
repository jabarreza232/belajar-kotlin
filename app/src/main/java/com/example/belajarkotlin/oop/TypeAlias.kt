package com.example.belajarkotlin.oop
typealias CustomerReg =RegularCustomer
typealias StringSupplier = (String)->String
fun main() {
    val customer= CustomerReg("Jabar")
    println(customer)

    sayHello("Jabar") { "$it" }
}
fun sayHello(name:String,supplier:StringSupplier){
    println("Hello ${supplier(name)}")
}