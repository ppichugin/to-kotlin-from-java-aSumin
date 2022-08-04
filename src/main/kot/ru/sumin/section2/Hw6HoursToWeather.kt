package ru.sumin.section2

fun main() {
    val timeOfDay = 10
    val isWeatherGood = false
    val isDay: Boolean = timeOfDay in 6..22
    val whatToDo: String = when {
        isDay && isWeatherGood -> "Гулять"
        isDay && !isWeatherGood -> "Читать книгу"
        else -> "Спать"
    }
    println(whatToDo)
}