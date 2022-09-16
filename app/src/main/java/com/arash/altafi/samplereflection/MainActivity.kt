package com.arash.altafi.samplereflection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.arash.altafi.samplereflection.models.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testKotlinReflection()
    }

    private fun testKotlinReflection() {
        val mapping = mapOf("Student" to Student::class, "Admin" to Admin::class)
        for ((key, value) in mapping) {
            val callingClass = value as KClass<*>
            val instance = callingClass.createInstance() as BaseUser
            Log.d("test123321", instance.userType.toString())
        }
    }

}