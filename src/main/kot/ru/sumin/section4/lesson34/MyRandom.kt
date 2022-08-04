package ru.sumin.section4.lesson34

import java.time.DayOfWeek
import kotlin.random.Random

class MyRandom {

    companion object {
        fun randomInt(range: IntRange): Int = range.random()
        fun randomBoolean(): Boolean = Random.nextBoolean()
        fun randomWeekDay(): String = DayOfWeek.of((1..7).random()).name
    }

}
