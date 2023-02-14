package com.lannstark.lec06

/**
 * Progression과 Range
 *
 * - IntRange는 IntProgression을 상속 받는다.
 * - IntProgrssion은 등차수열이다
 *
 * - 3 downTo 1
 * 시작값 3 / 끝값 1 / 공차 -1
 *
 * - 1..5 step2
 * 시작값 1 / 끝값 5 / 공차 2
 */

/**
 * 전통적인 for문
 */
fun main() {
    forEx()
    forEx2()
    forEx3()
}

fun forEx() {
    for (i in 1..3) {
        println(i)
    }
}

fun forEx2() {
    for (i in 3 downTo 1) {
        println(i)
    }
}

fun forEx3() {
    for (i in 1..5 step 2) {
        println(i)
    }
}