package com.lannstark.lec01

fun main() {

    /**
     * ⒈ 변수 선언 키워드
     *
     * - var (variable) : 가변
     * - val (value) : 불변
     *
     * - TIP : 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
     */
    var number1: Long  = 10L
    number1 = 5L

    // 타입을 명시적으로 작성하지 않아도, 타입이 추론된다.
    val number2: Long = 10L

    // 초기값을 지정해주지 않는 경우는?! → 최초에 한 번은 초기화 시켜줘야 한다.
    var number3: Long
    number3 = 10L
    println(number3)

    val number4: Long
    number4 = 10L
    println(number4)

    //val 컬렉션에는 element를 추가할 수 있다.
    val mutableList = mutableListOf("1", "2")
    mutableList.add("5")
    println(mutableList)

    /**
     * ⒉ Kotlin에서의 Primitive Type
     *
     * 숫자, 문자, 불리언과 같은 몇몇 타입은
     * 내부적으로 특별한 표현을 갖는다.
     *
     * 이 타입들은 실행시에 Primitive Value로 표현되지만,
     * 코드에서는 평범한 클래스 처럼 보인다.
     *
     * 즉, 겉으로는 Wrapper 클래스처럼 보여도
     * 코틀린은 특정 상황에 (연산 등등) 내부적으로
     * Primitive Type으로 변경해서 처리를 해준다.
     */
    var num1: Long = 10L
    var num2: Long = 1000L

    /**
     * ⒊ kotlin에서의 nullable 변수
     *
     * - 기본적으로 모든 변수에 null을 넣을 수 없게 끔 설계가 되어 있다.
     * Kotlin에서 null이 변수에 들어갈 수 있다면 "타입?"를 사용해야 한다.
     *
     * - 아예 다른 타입으로 간주된다.
     */
    var num3: Long? = 1000L
    num3 = null

    /**
     * ⒋ 객체 인스턴스화
     *
     * - new 키워드를 사용하지 않는다.
     */
    var person = Person("gilbert")

}