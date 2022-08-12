package com.example.belajarkotlin.generic

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data = TypeErasure("Eko")
    val name: String = data.getData()
    println(name)

    //Error Kompilasi
    val data2: TypeErasure<Int> = data as TypeErasure<Int>
    val dataInt = data2.getData()
    println(dataInt)


}
