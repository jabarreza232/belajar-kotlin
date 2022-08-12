package com.example.belajarkotlin.anotation

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_GETTER
)
@Retention(AnnotationRetention.RUNTIME)
annotation class Beta()

class ExampleTarget(@field:Beta val firstName:String,
                    @get:Beta val middleName:String,
                    @param:Beta val lastName:String
)