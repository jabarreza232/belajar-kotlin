package com.example.belajarkotlin.collection

import com.example.belajarkotlin.generic.Person

fun main() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Jabar")
    mutableList.add("Syahrial")
    mutableList.add("Reza")

    mutableList[0]="Rere"
//    mutableList.remove("Reza")
    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])



}