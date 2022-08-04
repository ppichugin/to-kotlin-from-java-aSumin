package ru.sumin.section4.lesson29

class Programmer(private val language: String, name: String, age: Int) : Worker(name, age) {
    override fun work(): String {
        return "Пишу код на языке: $language"
    }
}