package ru.sumin.section4.lesson32

class Sportsman {
    inline fun callWaterBoy(bringWater: () -> Unit) {
        bringWater.invoke()
    }
}