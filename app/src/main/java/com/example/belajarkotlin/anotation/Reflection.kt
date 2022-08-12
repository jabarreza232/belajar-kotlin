package com.example.belajarkotlin.anotation

import com.example.belajarkotlin.oop.User
import java.lang.Exception
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validateRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties

    //iterate satu-satu, lalu cek kalo ada annotation @NotBlank

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(request)
            when (value) {
                is String -> {
                    if ("" == value) {
                        throw Exception("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = User("Jabar")
    validateRequest(request)
}