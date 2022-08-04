package ru.sumin.section2

private var text1: String? = null
private var text2: String? = "Name2"
private var text3: String? = ""


fun main() {
    val res = (text1?.length ?: 0) + (text2?.length ?: 0) + (text3?.length ?: 0)
    println(res)
}