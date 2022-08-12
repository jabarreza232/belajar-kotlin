package com.example.belajarkotlin.function

fun main() {
    val upperTransformer = { value: String -> value.uppercase() }
    val lowerTransformer = { value: String -> value.lowercase() }

    println(hello("jabar", upperTransformer))
    //trailing lambda. (hanya bisa ketika paramater lambda ada di akhir)
    println(hello("Jabar") {
        it
    })

}

fun hello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
}