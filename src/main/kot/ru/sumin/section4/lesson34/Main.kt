package ru.sumin.section4.lesson34

fun main() {
    for (i in 1..10) {
        println(MyRandom.randomBoolean())
        println(MyRandom.randomInt(1..70))
        println(MyRandom.randomWeekDay())
        println("---")
    }
}