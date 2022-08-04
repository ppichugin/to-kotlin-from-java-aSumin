package ru.sumin.section4.lesson29

open class Worker(val name: String, val age: Int) {
    open fun work(): String {
        return "Работаю..."
    }
}