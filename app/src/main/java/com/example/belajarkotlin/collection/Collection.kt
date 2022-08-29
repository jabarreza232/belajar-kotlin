package com.example.belajarkotlin.collection

fun <T>displayCollection(collection: Collection<T>){
    for(element in collection){
        println(element)
    }
}


fun main() {
    displayCollection(listOf("Eko","Kurniawan"))
    displayCollection(setOf("Eko","Kurniawan"))
    displayCollection(mapOf("Eko" to "Kurniawan").entries)
//    displayCollection(mapOf("Eko" to "Kurniawan")) // error , Map bukan turunan dari collection



}
