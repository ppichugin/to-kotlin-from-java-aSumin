package ru.sumin.section4.lesson26

fun main() {
    val address1 = Address("Moscow", "Набережная", 25)
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

class Address(private val city: String, private val street: String, private val homeNumber: Int) {
    fun copy(city: String = this.city, street: String = this.street, homeNumber: Int = this.homeNumber): Address {
        return Address(city, street, homeNumber)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (homeNumber != other.homeNumber) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + homeNumber
        return result
    }

    override fun toString(): String {
        return "Address(city='$city', street='$street', homeNumber=$homeNumber)"
    }

    operator fun component1(): String {
        return this.city
    }

    operator fun component2(): String {
        return this.street
    }

    operator fun component3(): Int {
        return this.homeNumber
    }
}