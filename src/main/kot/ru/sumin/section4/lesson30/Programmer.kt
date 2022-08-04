package ru.sumin.section4.lesson30

class Programmer(private val language: String, name: String, age: Int) : Worker(name, age), Cleaner {
    override fun work() {
        println("Пишу код на языке: $language")
    }

    override fun clean() {
        println("Программист убирает")
    }
}