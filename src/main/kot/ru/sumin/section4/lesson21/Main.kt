package ru.sumin.section4.lesson21

fun main() {
    val dog = Dog()
    dog.age = -6
    dog.nickname = "plutto"
    dog.weight = 78.0

    println("Имя: ${dog.nickname} Возраст: ${dog.age} Вес: ${dog.weight}")
}