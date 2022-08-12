package com.example.belajarkotlin.function

fun main() {

    fun hello(value: String, transformer: (String) -> String): String {
        return "Hello ${transformer(value)}"
    }
    val upper = fun(value:String):String{
        if(value=="")
            return "UPS"
        else return value.uppercase()
    }

    println(hello("Jabar",upper))
}


