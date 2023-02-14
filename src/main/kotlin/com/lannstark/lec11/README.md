### 접근 제어자

> 코틀린에서는 패키지라는 개념을 접근 제어에 사용하지 않는다.
> 코틀린에서 패키지는 namespace 관리용이다.

- public : 모든 곳에서 접근 가능
- protected : 선언된 클래스 또는 하위 클래스에서만 접근 가능.
- internal : 같은 모듈에서만 접근이 가능하다.
- private 선언된 클래스 내에서만 접근 가능

<br>

### 기본 접근 지시어

- Java에서는 default
- Kotlin에서는 public

<br>

### 코틀린 파일의 접근 제어

- public : 기본 값, 어디서든 접근할 수 있다.
- protected : 파일(최상단)에는 사용 불가능
- internal : 같은 모듈에서만 접근 가능
- private : 같은 파일 내에선만 접근 가능

<br>

### 생성자의 접근 제어

- 생성자에 접근 지시 어를 붙이려면, constructor를 써줘야 한다.

```kotlin
final class Human public constructor()
open class HumanV1 protected constructor()
class HumanV2 internal constructor()
```

<br>

### Java와 Kotlin을 함께 사용할 때 주의할 점

1.
internal은 바이트 코드 상 public이 된다.
때문에 Java코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.

예를 들어 상위 모듈이 Java로 이루어져 있고, 하위 모듈이 Kotlin으로 이루어져 있다면,
하위 모듈 내에서 internal이라고 정의되어진 field나 함수 둥을 상위 모듈에서 바로 가져올 수 있다.

<br>

2.
Kotlin의 protected와 Java의 protected는 다르다.

- Java : 같은 패키지 또는 하위 클래스에서만 접근 가능.
- Kotlin : 선언된 클래스 또는 하위 클래스에서만 접근 가능.

하지만 Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다.