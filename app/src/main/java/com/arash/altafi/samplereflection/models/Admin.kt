package com.arash.altafi.samplereflection.models

class Admin : BaseUser() {

    init {
        userType = UserType.ADMIN
    }

}