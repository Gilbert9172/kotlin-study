package com.lannstark.lec10

interface Swimable {

    // 코틀린에서는 backing field가 없는 프로퍼티를 Interface에 만들 수 있다.
    // 해당 프로퍼티에 대한 getter는 구현 객체에서 정의해주길 기대한다.
    val swimAbility: Int

    fun act() {
        println("어푸 어푸")
    }

}