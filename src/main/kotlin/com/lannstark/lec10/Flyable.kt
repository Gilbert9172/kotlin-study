package com.lannstark.lec10

interface Flyable {

    fun act() {
        println("파닥파닥")
    }

    // 추상 메소드
    fun fly()

}