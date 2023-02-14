package com.lannstark.lec13

/**
 * `[ 클래스 안의 static 클래스(Java) == 클래스 안의 클래스(Kotlin) ]`
 *
 * 권장하는 모델
 *
 * 그냥 class 만들면 됨.
 */
class House(
    private var address: String,
    private var livingRoom: LivingRoom
) {
    class LivingRoom(
        private var area: Double
    )
}

/**
 * `[클래스 안의 클래스(Java) == 클래스 안의 inner 클래스(Kotlin)]`
 *
 * - `this@outterClass`
 */
class HouseV2(
    private var address: String,
    private var livingRoom: LivingRoomV2
) {
    inner class LivingRoomV2 (
        private var area: Double
    ) {
        val address: String
            get() = this@HouseV2.address
    }
}