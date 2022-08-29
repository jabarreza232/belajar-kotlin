package com.example.belajarkotlin.collection


class Member(val name: String, val hobbies: List<String>)


//mengubah suatu nested collection menjadi sebuah flat/di gabungkan item collection nya
fun main() {

    val list: List<List<String>> = listOf(
        listOf("Eko", "Kurniawan", "Khannedy"),
        listOf("Eko", "Kurniawan", "Khannedy"),
        listOf("Eko", "Kurniawan", "Khannedy"),
        listOf("Eko", "Kurniawan", "Khannedy"),
    )
    val members: List<Member> = listOf(
        Member("Eko", listOf("Reading", "Coding")),
        Member("Budi", listOf("Gaming", "Traveling"))
    )

    val listString: List<String> = list.flatten()

//    val hobies = members.map { it.hobbies }.flatten()
    val hobies = members.flatMap { it.hobbies }
    println(hobies)

}