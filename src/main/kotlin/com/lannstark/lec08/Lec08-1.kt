package com.lannstark.lec08

/**
 * 함수 선언 문법
 */
fun v1(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun v2(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun v3(a: Int, b: Int): Int =  if (a > b) { a } else { b }

// `=`를 사용하면 반환 타입 생략 가능
fun v4(a: Int, b: Int) = if (a > b) a else b
