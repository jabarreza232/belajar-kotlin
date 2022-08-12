package com.example.belajarkotlin.oop

fun fireAction(action: Action) {
    action.action()
}

fun main() {

    fireAction(object : Action{
        override fun action() {
            println("action 1")
        }
    })
}