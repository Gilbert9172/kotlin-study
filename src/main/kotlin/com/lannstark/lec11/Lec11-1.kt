package com.lannstark.lec11

/**
 * 생성자에 접근 지시어 사용하기.
 */

// 기본적으로 final, public이 생략되어 있다.
final class Human public constructor()

// protected - 선언된 클래스 또는 하위 클래스에서만 접근 가능.
// protected의 경우에는 하위 클래스에서 접근이 가능해야 하기 때문에 open을 사용한다.
// open을 작성하지 않으면 This type is final, so it cannot be inherited from 라는 에러 문구가 나옴.
open class HumanV1 protected constructor()

// internal
class HumanV2 internal constructor()