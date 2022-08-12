package com.example.belajarkotlin.oop

class Car(paramBrand: String, paramName: String, paramYear: Int = 2020) {


    var brand: String = paramBrand
        get() {
            println("Call getter")
            return field
        }
        set(value) {
            println("Call setter")
            if (value.isNotBlank()) {
                field = value
            }
        }
    var year: Int = paramYear
        get() {
            println("Call getter")
            return field
        }
        set(value) {
            println("Call setter")
            if (value > 0) {
                field = value
            }
        }

    init {
        println("Car $paramBrand di buat")
    }

    constructor(paramBrand: String, paramName: String) : this(paramBrand, paramName, 2020) {
        println("Secondary Constructor1")
    }

    constructor(paramBrand: String) : this(paramBrand, "") {
        println("Secondary Constructor2")
    }

    override fun toString(): String {
        return "Car is $brand"
    }


}