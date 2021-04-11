# 오브젝트
* 코틀린으로 오브젝트 내용을 정리 및 실습

## 목차


## 챕터 1 요약
```
* 모듈이 가져야 하는 세가지 기능 by 로버트 마틴
  * 제대로 동작하는 것
  * 변경을 위해 존재하는 것
  * 코드를 읽는 사람과 의사소통 하는 것
* 책임의 이동
  * 책임이 하나의 요소에 중앙집중 : 타 모듈간의 의존성이 높다. 결합도 크다.
  * 책임이 여러 요소에 분산배치
* 적절한 트레이드 오프 (P.33장 : 책을 다시 살펴볼 것)
  * 결합도를 높이는 대신에 객체의 자율성을 부여할 것인지
    * 다른 객체에 대한 의존성이 추가되어 스스로 할 일이 더 늘어난 상태를 의미
  * 결합도를 낮추는 대신에 객체의 자율성을 상실할 것인지
* 현실에서 수동적인 존재들도 객체지향의 세계로 들어오면 능동적이고 자율적인 존재로 변하게 된다.
```

## 챕터 2 요약
```
* 어떤 클래스가 필요한지 생각하기 보다는 어떤 객체가 필요한지에 주안을 둔다.
  * 클래스의 윤곽을 잡기 위해선, 어떤 객체들이 어떤 상태와 행동을 가지는지 생각한다.
* 클래스의 경계를 구분짓는 것은 중요하다.
  * 객체 내부의 접근을 통제하는 이유는 객체를 자율적인 존재로 만들어주기 위해서다.
    * 객체 지향의 핵심은 객체가 스스로 상태관리, 판단, 행동을 하도록 하는 것이다.
  * 클래스의 작성자가 내부 구현을 은닉하게 해준다.
  * 클라이언트 프로그래머가 실수로 숨겨진 부분을 접근하는 것을 막아준다.
  * 클라이언트 프로그래머 : 클래스 작성자가 추가한 데이터 타입을 사용하는 사람
* 설계가 필요한 이유는 변경을 관리하기 위해서다.
* 확장 가능한 객체지향 설계가 가지는 특징은 코드의 의존성과 실행시점의 의존성이 다르다는 것이다. (컴파일/런타임 의존성)
  * (중요) P.59 장
* 메시지와 메소드는 다른 개념이다.
  * 동일한 메세지를 전달하지만, 메소드의 실행은 클래스가 무엇이냐에 따라 결정된다. : 다형성
  * 동일한 메시지를 전달하지만, 실행시점에 결정한다. : 지연 바인딩 또는 동적 바인딩
* 추상화
  * 추상화를 이용하면 요구사항을 높은 정책으로 서술할 수 있다.
  * 추상화를 이용하면 설계가 좀 더 유연해질 수 있다.
  * (중요) P.65장 ~ 66장
* (중요) 프로그래밍 관점에 너무 치우져, 객체지향을 바라볼 경우 객체지향의 본질을 놓치기 쉽다. 
  * 객체를 바라보는 것에서 객체지향은 시작이다.
  * 객체들의 상호작용과 협력이 중요하다.
```

## 챕터 3 요약
```
* 객체지향의 본질은 협력하는 객체들의 공동체를 창조하는 것
  * 코드로 구현하기 이전에 항상** 어떤 역할과 책임이 필요한지 고민을 해야한다.
* 어떠한 객체도 섬이 아니다. 
* 협력은 객체를 설계하는데 일종의 문맥(context) 을 제공한다.
* 책임은 두 가지로 구성
  * 객체가 무엇을 알고 있는가?
  * 객체는 무엇을 할 수 있는가?
* 책임은 객체지향 설계의 핵심
  * 협력을 설계하기 위해선 책임에 초점을 맞추어야 한다.
  * 메시지가 객체를 결정한다.
  * 행동이 상태를 결정한다.
* 항상 협력이라는 문맥(context) 안에서 객체를 생각하여야 한다.
  * 객체의 행동에 초점을 맞춘다. (상태에 초점을 맞추지 않는다.)
=> 협력이 객체의 행동을 결정하고, 행동이 상태를 결정한다. 그리고 그 행동이 객체의 책임이 된다.
* (중요) 객체의 관해서 생각할 때는 이 객체가 무슨 역할을 수행하는가 자문해보아야 한다.
```

## 챕터 4 요약
```
* 객체가 다양한 상황에서 사용될 수 있을 것이라는 막연한 추측을 기반으로 설계를 진행한다.
  * 프로그래머는 내부 상태를 드러내는 메소드를 최대한 많이 추가해야하는 압박에 시달릴 수 밖에 없다. 그러면 결과적으로 대부분의 내부 구현이 퍼블릭 인터페이스에 노출될 수 밖에 없다. 그 결과 캡슐화의 원칙을 위반하는 변경에 취약한 설계를 얻게된다.
* 캡슐화를 지킨다는 것은 단순히 속성 값을 반환하거나 변경하는 접근지정자를 의미하는 것이 아니다.
  * 객체에게 의미있는 메소드는 객체가 책임져야할 무언가를 수행하는 메소드이다.
  * 내부의 속성을 외부로 감추는 것은 캡슐화의 한 종류일 뿐이다. 캡슐화는 변할 수 있는 어떤 것이라도 감추는 행위를 의미한다. 내부 구현의 변경으로 인해 외부의 객체가 변경받는다면 해당 부분은 캡슐화를 위반한 것이다.
```


## 코틀린과 오브젝트를 하면서 느낀 것.
* data class 는 필요한 경우에만 쓰고, 클래스의 내/외부 경계를 위해 기본 class 에 private 지정자를 포함한 생성자를 만들어 받도록 한다.
  * 생성자로 받도록 하였는데 get 메소드가 필요하다면 private 은 제거하도록 한다.
* 코틀린의 [named arguments](https://kotlinlang.org/docs/functions.html#named-arguments) 를 잘 쓰는 것이 좋지 않을까?
  * 코드리뷰를 받으면서 named arguments 에 대해서 이야기를 하게 되었는데, 문득 드는 생각은 여러 개의 동일 데이터 타입에 대해서는 명시적인 선언으로 할당해주는게 좋지 않을까란 생각해본다.
  * IDE 에서 물론 힌트를 주지만, 힌트는 힌트일뿐 언제나 휴먼에러가 발생할 수 있을 것이고 따로 해당 부분은 컴파일에서 인지가 못되기 때문이다.
