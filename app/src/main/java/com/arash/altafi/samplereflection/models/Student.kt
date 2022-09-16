package com.arash.altafi.samplereflection.models

class Student : BaseUser() {

    init {
        userType = UserType.STUDENT
    }

}