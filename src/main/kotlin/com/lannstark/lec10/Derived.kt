package com.lannstark.lec10

/**
 * 상속 관련 키워드 4가지 정리
 *
 * 1. final : override를 할 수 없게 한다. default로 보이지 않게 존재한다.
 * 2. open : override를 열어 준다.
 * 3. abstract : 반드시 override 해야한다.
 * 4. override : 상위 타입을 오버라이드 하고 있다.
 */
fun main() {
    val derived = Derived(300)
    println(derived.number)
}

class Derived(
    override val number: Int
) : Base(number = number) {
    init {
        println("Derived Class")
    }
}