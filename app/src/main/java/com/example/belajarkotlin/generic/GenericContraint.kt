package com.example.belajarkotlin.generic

open class Employee

interface CanSayHello{
    fun sayHello(name:String)

}
class Manager : Employee()
class VicePresident : Employee(),CanSayHello {
    override fun sayHello(name: String) {
      println("Hello $name, I'm a vice president")
    }
}

class Company<T>(val employee: T) where  T : Employee, T : CanSayHello

fun main() {
//    val data1 = Company(Employee())
//    val data2 = Company(Manager())
    val data3 = Company(VicePresident())
//    val data4 = Company("DDD") // Error
}

