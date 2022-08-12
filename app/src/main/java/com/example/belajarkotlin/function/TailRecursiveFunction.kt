package com.example.belajarkotlin.function

fun main() {
    println(factorialTail(10))
}
//Output
//(10,1)
//(9,10)
//(8,90)
tailrec fun factorialTail(value: Int,total:Int = 1): Int {
    return if (value == 1) {
        total
    } else {
        factorialTail(value - 1, total * value)
    }
}

tailrec fun display(value: Int) {
    println("Recursive $value")
    if (value > 0) {
        display(value - 1)
    }
}
