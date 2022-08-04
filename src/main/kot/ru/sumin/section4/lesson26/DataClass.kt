package ru.sumin.section4.lesson26

fun main() {
    val address1 = AddressAsDataClass("Moscow", "Набережная", 25)
    val address2 = address1.copy()

    println(address1)
    println(address2)

    println(address1.hashCode())
    println(address2.hashCode())

    println(address1 === address2) //as links
    println(address1 == address2)  //as equals

    val(c, s, n) = address1 //destructing operator

    println("Город: $c ул.: $s дом: $n")
}

data class AddressAsDataClass(val city: String, val street: String, val homeNumber: Int)