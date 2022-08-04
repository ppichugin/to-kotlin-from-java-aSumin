package ru.sumin.section4.lesson32

fun main() {
    // Анонимные классы
    val sportsman = Sportsman()
    sportsman.callWaterBoy { println("Вода принесена") }
}