package com.example.belajarkotlin.collection

fun main() {
    val map = mapOf(
        "a" to "Eko",
        "b" to "Kurniawan",
        "c" to "Khannedy"
    )
//    println(map.getValue("Tidak ada")) // exception
    println(map.getOrElse("tidak ada") { "Kosong" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "b" })
    println(map.filterValues { it.length > 5 })

}