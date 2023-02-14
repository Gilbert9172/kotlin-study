package com.lannstark.lec10

import com.lannstark.lec11.HumanV2

/**
 * extends 키워드를 사용하지 않고, 콜론(:)을 사용하여 상속을 표현함.
 *
 * override라는 지시어를 사용한다.
 */
class Cat(
    species: String
) : Animal(species, 4) {

    // override라는 지시어 사용
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}