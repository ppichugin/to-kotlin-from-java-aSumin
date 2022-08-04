package ru.sumin.section4.lesson35

// Singleton

object Db {
    val sqlDb = mutableListOf<String>()
    fun writeRecord(str: String) {
        sqlDb.add(str)
    }
}