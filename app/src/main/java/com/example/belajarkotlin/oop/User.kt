package com.example.belajarkotlin.oop

import com.example.belajarkotlin.anotation.NotBlank

data class User (@NotBlank val username:String="",@NotBlank  val password:String="")

