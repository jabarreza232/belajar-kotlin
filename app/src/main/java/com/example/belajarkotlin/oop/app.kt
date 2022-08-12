package com.example.belajarkotlin.oop

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun main() {
//    val avanza = Car("Avanza")
    val user1 = User()
    val employee = Manager("Jabar")
    val customer = RegularCustomer("Jabar")
    val tv = Telivision()
    val human = Human("Jabar")
//    tv.initTelevision("Samsung")
    //Inner class
    val boss1 = Boss("Reza")
    val employe1 = boss1.Employee("Jabar")
    val employe2 = boss1.Employee("Syahrial")
    employe1.hi()
    employe2.hi()

    //Data class
    val product = Product("Indomie", 20_000, "Food")
    val product2 = product.copy(name = "Supermie")
    val (name, price) = product

    println(name)
    println(price)

//    human.sayHello("Woi")
//    human.move()
//    avanza.brand = ""
//    println(avanza.brand)
//    println(user1.username)
//
//    println(customer.name)
//    println(customer.type)
//    println(customer.balance)
}