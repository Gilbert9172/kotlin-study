package com.lannstark.lec04

/**
 * 4. 연산자 오버로딩
 *
 * - 코틀리에서는 객체마다 연산자를 직접 정의할 수 있다.
 */
fun main() {
    val point1 = Point(10, 20)
    val point2 = Point(30, 40)

    println(point1 + point2)
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}