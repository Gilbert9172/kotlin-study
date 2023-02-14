package com.lannstark.lec09

/**
 * custom getter, setter
 */
fun main() {
    val person = PersonV3(name = "KEVIN", age = 20)
    println(person.age)
    println(person.isAdultV0())
    println(person.isAdultV1)
    println(person.isAdultV2)
    println(person.getUppserCaseName())
    println(person.getUppserCaseV1)
    println(person.getUppserCaseV2)
}

class PersonV3(
    val name: String = "gilbert",   // 기본 프로퍼티의 get()을 커스텀 할 때는 앞에 val또는 var을 빼준다.
    var age: Int = 29
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    fun isAdultV0(): Boolean {
        return this.age >= 20
    }
    /**
     * `[custom getter]`
     *
     * isAdult를 프로퍼티 처럼 사용
     *
     * isAdult를 get했을 때의 로직을 새롭게 정의할 수 있다.
     *
     * 객체의 속성을 나타낼 떄 사용하면 좋다. 그렇지 않을 경우에는 함수를 사용하면 된다.
     */
    val isAdultV1: Boolean
        get() = this.age >= 20

    val isAdultV2: Boolean
        get() {
            return this.age >= 20
        }

    /**
     * field 자리에 name을 작성하게 되면 무한루프에 빠진다.
     * 왜냐면 Perons.name을 할 경우 name의 get을 호출하고, name은 다시 get을 호출하기 때문이다.
     *
     * 따라서 자기 자신을 나타내는 예약어인 field를 사용해야 한다.
     * field를 보이지 않는, 자기 자신을 가리킨다 라는 의미로 backing field라고 부른다.
     */
//    val name = name
//        get() = field.uppercase()

    fun getUppserCaseName(): String {
        return this.name.uppercase()
    }

    val getUppserCaseV1 = this.name.uppercase()

    val getUppserCaseV2: String
        get() = this.name.uppercase()
}
