package com.example.belajarkotlin.collection
//menerima data berdasarkan posisi index collection
fun main() {
    val set = setOf("Eko","Kurniawan","Khannedy")
    //hati hati memakai nya karna menggunakan perulangan biasa. sampai posisi nya di tentukan.

    println(set.elementAt(1)) //sample index <= 1 maka perulangan sampai index sama dengan ke 1
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(2))
    println(set.elementAtOrNull(10))
    println(set.elementAtOrElse(2){"Tidak ada"})
    println(set.elementAtOrElse(10){"Tidak ada"})

}