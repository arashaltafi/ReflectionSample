package com.arash.altafi.samplereflection.models

open class BaseUser(var name: String = "Hello") {

    lateinit var userType: UserType

    fun printName() {
        print(name)
    }
}
