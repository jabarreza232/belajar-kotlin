package com.example.belajarkotlin.generic

class Data<T>(val data: T)

fun Data<String>.print() {
    val data: String = this.data
    println(data)
}

fun Data<Int>.printInt() {
    val data: Int = this.data
    println(data)
}

fun main() {
    val data1 = Data(1)
    val data2 = Data("Jabar")

    data1.printInt()//error
    data2.print()

}