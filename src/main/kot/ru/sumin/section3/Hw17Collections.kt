package ru.sumin.section3

fun main() {
    val data = mapOf(
        "Январь" to listOf(200, 100, 400, 300),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    val filterCorrectData = data.filter { it -> it.value.all { it > 0 } }
    val averagePerWeek = filterCorrectData.values.flatten().average()
    val averagePerMonth = filterCorrectData.values.sumOf { it.average() }

    val maxRevenuePerMonth = filterCorrectData.values.maxOf { it.sum() }
//    val maxRevenueMonth = filterCorrectData.entries.maxBy { entry -> entry.value.sum() }.key
    val maxRevenueMonths = filterCorrectData.filter { it -> it.value.sum() == maxRevenuePerMonth }.keys

    val minRevenuePerMonth = filterCorrectData.values.minOf { it.sum() }
//    val minRevenueMonth = filterCorrectData.entries.minBy { entry -> entry.value.sum() }.key
    val minRevenueMonths = filterCorrectData.filter { it -> it.value.sum() == minRevenuePerMonth }.keys
    val incorrectDataInMonths = data.filterNot { it -> it.value.all { it > 0 } }.keys

    println("Средняя выручка в неделю: $averagePerWeek")
    println("Средняя выручка в месяц: $averagePerMonth")
    println("Максимальная выручка в месяц: $maxRevenuePerMonth")
    println("Была в следующих месяцах: $maxRevenueMonths")
    println("Минимальная выручка в месяц: $minRevenuePerMonth")
    println("Была в следующих месяцах: $minRevenueMonths")
    println("Ошибки произошли в следующих месяцах: $incorrectDataInMonths")
}