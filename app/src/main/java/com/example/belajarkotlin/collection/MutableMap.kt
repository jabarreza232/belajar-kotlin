package com.example.belajarkotlin.collection

import android.annotation.SuppressLint


@SuppressLint("NewApi")
fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap.put("a", "Eko")
    mutableMap["b"] = "Kurniawan"
    mutableMap["c"] = "Khannedy"

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap.get("c"))
    println(mutableMap.getOrDefault("d", "Tidak ada"))
    println(mutableMap.get("d"))

    mutableMap.remove("b")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }


}