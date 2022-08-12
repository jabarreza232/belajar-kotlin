package com.example.belajarkotlin.function

import java.util.*

fun toUpper(value: String): String = value.uppercase()
fun main() {
    //return value lambda di ambil dari baris akhir
    val lambdaName: (String, String) -> String = { name: String, value: String ->
        "${name.uppercase(Locale.getDefault())} ${value.uppercase()}"
    }
    val lambdaRefrence: (String) -> String = ::toUpper

    val name = lambdaName("Jabar", "Reza")
    println(name)

}