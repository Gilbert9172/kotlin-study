package com.lannstark.lec03

// 타입 캐스팅
fun main() {
    printAgeIfPersonNull(null)
    printAgeIfPerson(Person("gilbert", 29))
}

/**
 * - is == Java의 InstanceOf
 * - !is == (!(obj instanceOf Person))
 * - A as Type == Java의 TypeCasting
 */
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person //as Person 생략 가능 => Smart Cast
        println(person.age)
    }
}

/**
 * obj에 null이 들어올 수 있는 경우
 *
 * - as? : null이 아니라면 casting
 */
fun printAgeIfPersonNull(obj: Any?) {
    val person: Person? = obj as? Person
    println(person?.age)
}

/**
 * value as Type
 * - value가 type이면 TypeCasting
 * - value가 type이 아니라면 Exception
 *
 * value as? Type
 * - value가 type이면 TypeCasting
 * - value가 null이면 null
 * - value가 type이 아니라면 null (주의)
 */