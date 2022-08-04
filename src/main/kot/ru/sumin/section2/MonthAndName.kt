package ru.sumin.section2

fun main() {
    val nameOfMonth = "May"

    val season: String = when (nameOfMonth) {
        "December", "January", "February" -> "Winter"
        "March", "April", "May" -> "Spring"
        "June", "July", "August" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> "Not defined"
    }
    println(season)
}