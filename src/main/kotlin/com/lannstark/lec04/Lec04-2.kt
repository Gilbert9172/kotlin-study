package com.lannstark.lec04

/**
 * 2. 비교 연산자와 동등성, 동일성
 *
 * - 자바와 코틀린 완전동일
 * - 자바와 다르게 객체를 비교할 때 비교 연산자를 사용하면 "자동으로 compareTo"를 호출해준다.
 *
 */
fun main() {
    코틀린_compareTo()
    동등성_동일성()
}

fun `코틀린_compareTo`() {
    val money1 = JavaMoney(2000L)
    val money2 = JavaMoney(1000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }
}

/**
 * 동등성(Equality) : 두 객체의 값이 같은가
 *
 * 동일성(Identity) : 완전히 동일한 객체인가? (같은 주소를 참조하고 있는가?)
 *
 * 자바에서는 동일성에 ==을 사용, 동등성에 equals를 직접 호출한다.
 *
 * 코틀린에서는 동일성에 ===을 사용 동등성에 ==를 호출한다.
 * ==를 사용하면 간접적으로 equals를 호출해준다.
 */
fun `동등성_동일성`() {
    val money1 = JavaMoney(1000L)
    val money2 = money1
    val money3 = JavaMoney(1000L)

    println(money1 === money3)
    println(money1 == money3)
    println(money1 === money2)
    println(money1 == money2)
    println(money2 === money3)
    println(money2 == money3)
}
