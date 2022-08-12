package com.example.belajarkotlin.generic

class GenericType<T, U>(val firstData: T, val secondData: U) {
    fun getData(): T = firstData


    @JvmName("getSecondData1")
    fun getSecondData(): U = secondData



    fun printData()= println("Data is $firstData $secondData")
}