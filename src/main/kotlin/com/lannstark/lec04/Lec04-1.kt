package com.lannstark.lec04

/**
 * 1. 단항 연산사 / 산술 연산자
 *
 * - 자바와 코틀린 완전동일!!!
 */
fun main() {
    단항_연산자()
    산술_연산자()
    산술_대입연산자()
}

fun `단항_연산자`() {

    var a: Int = 10;
    a++
    println(a)
}

fun `산술_연산자`() {
    var a: Int = 10;
    println(a/5)
    println(a%4)
}

fun `산술_대입연산자`() {
    var a: Int = 10
    a += 3
    println(a)
}