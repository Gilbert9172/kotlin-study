package com.lannstark.lec02

fun main() {
    val answer = calculate(null)
    println(answer)
}

fun calculate(number: Long?):Long {
    number ?: throw IllegalArgumentException("값을 입력해주세요.")
    return number*2
}