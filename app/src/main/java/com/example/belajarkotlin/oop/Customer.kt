package com.example.belajarkotlin.oop

open class Customer(val name: String, val type: String, val balance: Long) {

    constructor(name: String) : this(name, "Balance", 0)
    constructor(name: String, balance: Long) : this(name, "Standard", balance)
}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name,"Premium", 0)
    constructor(name: String, balance: Long) : super(name,"Premium", balance)
}

class RegularCustomer(name: String, balance: Long) : Customer(name,"Regular", balance) {
    constructor(name: String) : this(name,0)

}