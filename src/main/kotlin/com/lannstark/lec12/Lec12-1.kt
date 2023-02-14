package com.lannstark.lec12

/**
 * static 대신 companion object 사용
 *
 * - companion object : 클래스와 동행하는 유일한 오브젝트
 *
 * 하나의 객체로 간주되기 때문에 이름을 붙일 수 있고, 다른 타입을 상속받을 수도 있다.
 *
 * - const : Compile 시에 값이 할당된다. / 진짜 상수에 붙이기 위한 용도, 기본 타입과 String에 붙일 수 있음.
 *
 */
fun main() {}

class Person private constructor (
    var name: String,
    var age: Int,
) {
    companion object Factroy : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        @JvmStatic
        fun newBabyV2(name: String): Person {
            return Person(name, MIN_AGE)
        }

        // companion object에서 인터페이스 구현
        override fun log() {
            println("나는 Person 클래스의 동행객체 입니다.")
        }
    }
}