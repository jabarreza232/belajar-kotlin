package com.example.belajarkotlin.generic

class ContraVariant<in T>{
    fun sayHello(param:T){
        println("Hello $param")
    }
    //ContraVariant gak boleh membuat function yang mengembalikan data
//    fun getData():T{
//        return data
//    }
}

fun main() {
    val contraVariantAny = ContraVariant<Any>()
    val contraVariantString:ContraVariant<String> = contraVariantAny
    // Gak boleh
//    contraVariantString.getData() Error
    contraVariantString.sayHello("Jabar")

}