package com.lannstark.lec06

/**
 * 1. for-each 문
 */
fun main() {
    listEx()
}

fun listEx() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }
}