package ru.sumin.section4.lesson31

fun main() {
    val car: AbstractTransport = Car("BMW")
    val bike: AbstractTransport = Bicycle("Racing bicycle")

    // smart cast
    if (car is Car) {
        car.name = "New BMX X6"
    }

    // Анонимные классы
    val sportsman = Sportsman()
    sportsman.callWaterBoy(object : WaterCarrier {
        override fun bringWater() {
            println("Вода принесена!")
        }
    })

}