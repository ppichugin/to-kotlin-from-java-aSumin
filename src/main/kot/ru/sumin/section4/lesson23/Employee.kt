package ru.sumin.section4.lesson23

import java.util.*

class Employee(val name: String, val title: String, val year: Int) {
    val stage: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - year

    fun toDo() {
        println("Я работаю")
    }
}

