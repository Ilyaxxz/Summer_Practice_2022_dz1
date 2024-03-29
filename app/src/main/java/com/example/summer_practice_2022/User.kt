package com.example.summer_practice_2022

import kotlin.random.Random

open class User(
    val name: String = "User",
    val email: String = "test@test.ru",
    protected val  age: Int = 0,
) : UserListener {

    constructor(
        name: String = "User",
        email: String = "test@test.ru",
    ): this(name, email, 0)

    init {
        val result =  calculate("sdsd")
        print(result)
    }

    protected var pass = ""

    override fun logMessage() {
        println("I am User")
    }

    fun calculate(
        secondName: String
    ): Int {
        val l = secondName.length
        val r = Random.nextInt(7)
        return l * r
    }
}