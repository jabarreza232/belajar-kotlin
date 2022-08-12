package com.example.belajarkotlin.generic

class Covariant<out T>(val data:T){
    fun data():T{
        return data
    }
    //Tidak boleh membuat function dengan input generic covariant
//    fun setData(param:T){
//        data=param
//    }
}

fun main() {
    val covariantString = Covariant<String>("Eko")
    val covariantAny:Covariant<Any> = covariantString


    println(covariantAny.data)
    //Tidak boleh
//    covariantAny.setData(100)
}