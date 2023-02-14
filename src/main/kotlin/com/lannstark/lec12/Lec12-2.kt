package com.lannstark.lec12

/**
 * SingleTon
 *
 * - object 키워드를 붙이면 끝
 */
fun main() {
    println(SingleTon.a)
}

object SingleTon {
    var a: Int = 10;
}

