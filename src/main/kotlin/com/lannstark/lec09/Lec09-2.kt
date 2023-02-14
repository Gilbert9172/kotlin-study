package com.lannstark.lec09

/**
 * 생성자와 init
 *
 * - init block : 클래스가 초기화 되는 시점에 한 번 호출되는 블록(생성자가 호출되는 시점)
 * - kotlin은 부생성자 보단, default parameter를 더 선호한다.
 */
fun main() {
    val person = PersonV2.of("Gilbert")
    println(person.age)
}

/**
 * 주 생성자 - 반드이 존재해야 한다.
 * 파라미터가 하나도 없는 경우에는 기본 생성자가 생성된다.
 */
class PersonV2 (
    val name: String,
    var age: Int = 20
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        //println("초기화 블록이 가장 먼저 호출")
    }

    /**
     * 부 생성자
     * - 있을 수도, 없을 수도
     * - 최종적으로 "주 생성자"를 this로 호출해야 한다.
     */
//    constructor(name: String): this(name, 1) {
//        println("[부생성자1] = 부생성자는 주 생성자를 호출한다.")
//    }
//
//    constructor(): this("Gilbert") {
//        println("[부생성자2] = 부생성자는 주 생성자를 호출한다.")
//    }

    /**
     * 정적 팩토리 메소드
     *
     * - companion object
     */
    companion object {
        fun of(name: String): PersonV2 {
            return PersonV2(name)
        }
    }
}
