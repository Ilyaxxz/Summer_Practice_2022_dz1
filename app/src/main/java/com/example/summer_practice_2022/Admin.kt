package com.example.summer_practice_2022

import android.util.Log

data class Admin(
    val myEmail: String = "admin@gmail.com",
) : User(
    email = myEmail,
    age = 6
) {

    override fun logMessage() {
        Log.e("Admin","I am $name, $age, $email")
    }


}