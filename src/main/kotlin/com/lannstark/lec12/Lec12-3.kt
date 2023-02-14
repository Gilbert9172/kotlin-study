package com.lannstark.lec12

/**
 * 익명 클래스
 *
 * Java에서는 `new 타입이름()`으로 익명클래스를 표현
 *
 * Kotliln에서는 `object : 타입이름`으로 표현
 */
fun main() {
    moveSomething(object : Movable {
        override fun fly() {
            println("fly fly")
        }

        override fun move() {
            println("move move")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}