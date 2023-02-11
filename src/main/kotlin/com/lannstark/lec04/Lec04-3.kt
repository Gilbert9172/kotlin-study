package com.lannstark.lec04

/**
 * 3. 논리 연산자와 코틀린에 있는 특이한 연산자
 *
 *
 * - in / !in
 * - a..b
 * - a`[i]` : a에서 특정 index i로 값을 가져온다.
 * - a`[i]` = b : a의 특정 index에 b를 넣는다.
 */
fun main() {
    논리연산자()
}

fun `논리연산자`() {
    if (fun1() || fun2()) {
        println("자바와 완전 동일 + 자바 처럼 Lazy Evaluation 수행")
    }
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}
