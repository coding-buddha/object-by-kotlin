# 오브젝트
* 코틀린으로 오브젝트 내용을 정리 및 실습

## 📖 챕터 1 요약
#### 모듈이 가져야 하는 세가지 기능 by 로버트 마틴
* 제대로 동작하는 것
* 변경을 위해 존재하는 것
* 코드를 읽는 사람과 의사소통 하는 것

#### 책임의 이동
* 책임이 하나의 요소에 중앙집중 : 타 모듈간의 의존성이 높다. 결합도 크다.
* 책임이 여러 요소에 분산배치
  
#### 적절한 트레이드 오프 (P.33장 : 책을 다시 살펴볼 것)
* 전체적인 설계에 대한 결합도를 높이는 대신에 객체의 자율성을 부여할 것인지
  * 다른 객체에 대한 의존성이 추가되어 스스로 할 일이 더 늘어난 상태를 의미
* 전체적인 설계에 대한 결합도를 낮추는 대신에 객체의 자율성을 상실할 것인지

#### 현실에서 수동적인 존재들도 객체지향의 세계로 들어오면 능동적이고 자율적인 존재로 변하게 된다. : 의인화

## 📖 챕터 2 요약
#### 어떤 클래스가 필요한지 생각하기 보다는 어떤 객체가 필요한지에 주안을 둔다.
* 클래스의 윤곽을 잡기 위해선, 어떤 객체들이 어떤 상태와 행동을 가지는지 생각한다.

#### 클래스의 경계를 구분짓는 것은 중요하다.
* 객체 내부의 접근을 통제하는 이유는 객체를 자율적인 존재로 만들어주기 위해서다.
  * 객체 지향의 핵심은 객체가 스스로 상태관리, 판단, 행동을 하도록 하는 것이다.
* 클래스의 작성자가 내부 구현을 은닉하게 해준다.
* 클라이언트 프로그래머가 실수로 숨겨진 부분을 접근하는 것을 막아준다.
  * 클라이언트 프로그래머 : 클래스 작성자가 추가한 데이터 타입을 사용하는 사람
  
#### 설계가 필요한 이유는 변경을 관리하기 위해서다.

#### 확장 가능한 객체지향 설계가 가지는 특징은 코드의 의존성과 실행시점의 의존성이 다르다는 것이다. (컴파일/런타임 의존성)
* (중요) P.59 장

#### 메시지와 메소드는 다른 개념이다.
* 동일한 메세지를 전달하지만, 메소드의 실행은 클래스가 무엇이냐에 따라 결정된다. : 다형성
* 동일한 메시지를 전달하지만, 실행시점에 결정한다. : 지연 바인딩 또는 동적 바인딩
    
#### 추상화
* 추상화를 이용하면 요구사항을 높은 정책으로 서술할 수 있다.
* 추상화를 이용하면 설계가 좀 더 유연해질 수 있다.
* (중요) P.65장 ~ 66장

#### (중요) 프로그래밍 관점에 너무 치우져, 객체지향을 바라볼 경우 객체지향의 본질을 놓치기 쉽다. 
* 객체를 바라보는 것에서 객체지향은 시작이다.
* 객체들의 상호작용과 협력이 중요하다.

## 📖 챕터 3 요약
* 객체지향의 본질은 협력하는 객체들의 공동체를 창조하는 것
  * 코드로 구현하기 이전에 `항상` 어떤 역할과 책임이 필요한지 고민을 해야한다.
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
    * 협력이 객체의 행동을 결정하고, 행동이 상태를 결정한다. 그리고 그 행동이 객체의 책임이 된다.
* (중요) 객체의 관해서 생각할 때는 이 객체가 무슨 역할을 수행하는가 자문해보아야 한다.


## 📖 챕터 4 요약
* 객체가 다양한 상황에서 사용될 수 있을 것이라는 막연한 추측을 기반으로 설계를 진행한다.
  * 프로그래머는 내부 상태를 드러내는 메소드를 최대한 많이 추가해야하는 압박에 시달릴 수 밖에 없다. 그러면 결과적으로 대부분의 내부 구현이 퍼블릭 인터페이스에 노출될 수 밖에 없다. 그 결과 캡슐화의 원칙을 위반하는 변경에 취약한 설계를 얻게된다.
* 캡슐화를 지킨다는 것은 단순히 속성 값을 반환하거나 변경하는 접근지정자를 의미하는 것이 아니다.
  * 객체에게 의미있는 메소드는 객체가 책임져야할 무언가를 수행하는 메소드이다.
  * 내부의 속성을 외부로 감추는 것은 캡슐화의 한 종류일 뿐이다. 캡슐화는 변할 수 있는 어떤 것이라도 감추는 행위를 의미한다. 내부 구현의 변경으로 인해 외부의 객체가 변경받는다면 해당 부분은 캡슐화를 위반한 것이다.

## 📖 챕터 5 요약 (책에 있는 패턴을 다시한번 살펴본다.)
* "메세지를 전송해야 하는데, 누구에게 전송하지?" 라는 것에 초점을 맞춘다.
* 변경에 취약한 클래스에 대한 정의
  * 코드를 수정해야 하는 이유를 한가지 이상 가지는 클래스이다. (이런 클래스가 있다면 해당 클래스의 응집도가 낮기 때문에 높이는 작업을 해주어야 한다.)
  * 코드를 통해 변경의 이유를 파악할 수 있는 방법은 p.152 를 본다.
* 메소드 응집도는 중요하다. p.167 ~ p.168
  * 어떤 일을 수행하는지 한눈에 파악하기 어려운 코드 : 전체적으로 살펴보는데 많은 시간이 소요된다.
  * 하나의 메소드 안에서 너무 많은 작업을 하고 있기 때문에 수정할 부분을 찾기 어려운 코드 : 많은 시간이 소요된다.
  * 메소드 내부에 일부 로직만 수정하더라도, 나머지 부분에서 버그가 발생할 경우가 높다.
  * 로직의 일부만 재사용하는 것이 불가하다.
  * 코드를 재사용하는 방법은 복붙밖에 없고, 그것은 코드 중복을 초래하기 쉽다.

## 📖 챕터 6 요약
#### 디미터 법칙
* 오직 인접한 이웃하고만 말하라 : 묻지 말고 시켜라 (Tell, Don't Ask)
* 오직 하나의 도트만 사용하라 : 다른 객체에 의존해서 getter() 를 남발하지 말라. 해당 객체가 스스로 일을 수행하도록 자율적인 존재가 되어야 한다.
  * 자율적인 존재가 `되지 않으면` 요구사항의 변경에도 쉽게 무너지는 불안정한 코드를 얻게된다.
* 오직 하나의 도트만 사용되는거에 초점을 맞추게 되면 반대로 해당 객체의 본질적인 책임을 놓칠 수 있다. (p.201)

#### 인터페이스에 의도를 드러내라
* 호출자와 피호출자사이에 관계를 명확히 해서 `의도를 드러내는 선택자 or 인터페이스` 가 되어야 한다.
* sellTo, buy, hold, ...
  
#### 원칙은 항상 참이 아니다.
* 원칙이 현재의 상황과 부적합하다면 과감하게 무시하여야 한다.

#### 명령-쿼리 분리 원칙
* 어떤 오퍼레이션(퍼블릭 인터페이스에 포함된 메시지) 도 명령이 동시에 쿼리여서는 안된다.
  * 객체의 상태를 변경하는 명령은 상태값을 가질 수 없다. : 변경만 할 수 있다.
  * 객체의 정보를 반환하는 쿼리는 상태를 변경할 수 없다. : 조회만 할 수 있다.
* 왜??? 명령-쿼리를 분리하여야 하는가? : 책 p.207 에서 자세히 설명하고 있다.
  * 명령과 쿼리를 뒤섞으면 실행결과를 에측하기가 어려워질 수 있다.

## 📖 챕터 7 요약
#### 프로시저 추상화 : 소프트웨어가 무엇을 해야하는지 추상화한다.
* 큰 문제를 잘게 나눈다. -> 기능분해
  * 하향식 분해
  * 하나의 메인 함수에 모든 기능들이 포함되게 될 수 있다.
  * 변경에 취약하고 영향도를 파악하기 어렵다.

#### 데이터 추상화 : 소프트웨어가 무엇을 알아야 하는지를 추상화한다.
* 데이터 추상화는 두가지로 나뉜다.
  * 타입을 추상화 : 추상 데이터 타입 (객체기반)
    * 오퍼레이션을 기준으로 타입을 묶는다.
  * 프로시저를 추상화 : 객체지향
    * 타입을 기준으로 오퍼레이션을 묶는다. (다형성을 가능케한다.)
    * (중요) `협력` 이라는 문맥을 고려하지 않고 객체를 고립시킨 채 오퍼레이션의 구현방식을 타입별로 분배하는 것은 올바른 객체지향 접근법이 아니다.
* 클래스는 추상데이터 타입인가? (p. 245 참고)
  * 맞으면서 아니다.
  
## 📖 챕터 8 요약
#### 의존성 이해
* 변경과 의존성
  * 어떤 객체가 예정된 작업을 수행하기 위하여 다른 객체를 필요로 할 때, 의존성을 가진다고 말할 수 있다.
  * 의존성은 단방향이다. a -> b
  * 의존성을 가지게 된다면 어떠한 형태로든 a -> b 의 형태에서 b 가 변경되면 충분히 a 도 변경될 소지가 있다는 것이다.
* 의존성 전이
  * a -> b -> c 가 있다고 가정했을 때, a 는 간접적으로 c 에 의존성을 가질 수 있다.
  * b 가 의존하는 대상 c 가 변경될 때, 간접적으로 의존하고 있는 a 도 변경될 가능성이 있다.
* 런타임 의존성 & 컴파일타임 의존성
  * 동일한 소스코드를 가지고 다양한 실행구조를 만들 수 있어야 한다.
* 컨텍스트 독립성
  * 클래스가 특정 문맥에 강하게 결합되어 있다면, 다른 문맥에서는 사용하기 어려워질 수 있다. 클래스가 사용될 특정한 문맥에 대한 최소한의 가정만 이루어져 있다면, 다른 문맥에서 사용하기 쉽다. 이를 컨텍스트 독립성이라고 한다.
  * 자신이 실행될 컨텍스트에 대한 구체적인 정보를 최대한 `적게` 알아야 한다.
    * 컨텍스트에 대한 정보가 적으면 적을수록 다양한 컨텍스트에 재사용될 수 있기 때문이다. (개인적으로 런타임 의존성과 컴파일타임 의존성 내용과 비슷하다고 생각한다.)
* 의존성 해결하기
  * 생성자를 통한 의존성 해결
  * setter 를 통한 의존성 해결
  * method arguments 를 통한 의존성 해결
  * `결론` : 생성자와 setter 를 혼합해서 쓰는 것도 좋고, 해당 의존성이 다른 문맥에서도 재사용되는지 여부에 따라서 선택적으로 사용하도록 한다.
#### 유연한 설계
* 의존성의 존재보다 의존성의 정도에 신경을 쓰자
  * 객체의 의존성을 있을 수 있다. 허나 결합도를 낮추기 위해 추상화된 의존성을 가지도록 해야한다.
  * Movie 가 AmountDiscountPolicy 를 가지는 것 보다 DiscountPolicy 를 가지는 것이 결합도를 낮추고 콘텍스트의 독립성을 높여준다.
* 추상화에 의존하기
  * 추상화와 결합도의 관점에서 의존 대상을 아래와 같이 구분하는 것이 좋다. 클라이언트가 정보를 얼마나 알아야하는가로 구분한다. (p. 268)
    * [결합도 상] 구체 클래스 의존성 : 클래스 구현체 자체에 대한 의존성을 가지는 행위
    * [결합도 중] 추상 클래스 의존성 : 협력하는 대상이 속한 클래스 상속 계층이 무엇인지 알고있어야 한다.
    * [결합도 하] 인터페이스 의존성
  * 결론적으로 의존하는 대상이 추상적일수록 결합도는 더 낮아진다.
* 의존성은 명시적으로 표현되어야 한다.
  * 컴파일타임의 의존성은 런타임시에 변경되도록 할 수 있고, 결합도가 낮아지는 이점을 누릴 수 있기 때문이다.

## 📖 챕터 9 : [유연한 설계] 요약
#### 개방-폐쇄 원칙 : Open-Closed-Principal
* "확장에 대해 열려고있고, 수정에 대해서는 닫혀있어야 한다."
  * 확장에 대해 열려있다. : 애플리케이션의 요구사항이 변경될 때 이 변경에 맞게 새로운 '동작' 을 추가해서 애플리케이션의 기능을 확장할 수 있다.
  * 수정에 대해 닫혀있다. : 기존의 '코드' 를 수정하지 않고도 애플리케이션의 동작을 추가하거나 변경할 수 있다. (기존의 코드를 수정하지 않는 것이 핵심으로 보임)
* 컴파일타임 의존성을 고립시키고, 런타임 의존성을 변경하라
  * 이는 결국 추상화의 의존을 말하고, 이를 통해 OCP 가 가능도록 하게 한다.
#### 생성 사용 분리
* 객체가 생성되는 쪽, 객체를 사용하는 쪽은 서로 분리가 되어야 한다. (p.267 : 책을 보고 이해하도록 하자.)
  * 도메인 객체와는 전혀 상관이 없는 가공의 객체를 이용해서 생성을 하는 방법도 있다. (p.291)
    * PURE FABRICATION (순수한 가공물) 은 행위적 분해에 의해 생성되는 것이 일반적이다.
    * 도메인의 개념이 만족스럽지 못하다면, 인공적인 객체를 만들도록 하자
#### 의존성 주입
* 생성자 주입
* setter 주입
* 메소드 주입
  * 주입된 의존성이 한 두 개의 메소드에서만 사용된다면 각 메소드의 인자로 전달하는 것이 더 나은 방법일 수 있다. (꼭 생성자로 주입을 하는 방법만 고려할 만한가? 라고 질문할 때 이런 답변도 있더라.)
#### 의존성 역전 원칙 (DIP)
* 상위 모듈은 하위모듈을 의존하는 것이 아니라, 동일한 레벨의 추상화된 상위 모듈을 의존하고, 하위의 모듈또한 마찬가지로 추상화된 상위 모듈을 의존하도록 하여야 한다. (p. 301)
* 패키지 구성또한 의존성 역전 원칙에 따라 구성을 고려해보아야 한다. (이건 책을 보는게 이해가 빠르다. p.304)
  * 특정한 context 로 부터 분리시켜 재사용성을 높일 때에 패키지 이동을 고려한다.
* 다양한 컨텍스트에서의 재사용이 핵심이고 그 이전에는 역할, 책임, 협력에 집중하여야 한다.
## 코틀린과 오브젝트를 하면서 느낀 것.
* data class 는 필요한 경우에만 쓰고, 클래스의 내/외부 경계를 위해 기본 class 에 private 지정자를 포함한 생성자를 만들어 받도록 한다.
  * 생성자로 받도록 하였는데 get 메소드가 필요하다면 private 은 제거하도록 한다.
* 코틀린의 [named arguments](https://kotlinlang.org/docs/functions.html#named-arguments) 를 잘 쓰는 것이 좋지 않을까?
  * 코드리뷰를 받으면서 named arguments 에 대해서 이야기를 하게 되었는데, 문득 드는 생각은 여러 개의 동일 데이터 타입에 대해서는 명시적인 선언으로 할당해주는게 좋지 않을까란 생각해본다.
  * IDE 에서 물론 힌트를 주지만, 힌트는 힌트일뿐 언제나 휴먼에러가 발생할 수 있을 것이고 따로 해당 부분은 컴파일에서 인지가 못되기 때문이다.

## 📖 챕터 10 : [상속과 코드의 재사용] 요약
#### DRY 원칙 : Don't Repeat Yourself
* 지식을 중복하지 마라 : 중복된 코드를 제거하라
  * 책에서는 상속을 사용해 코드의 중복을 제거하도록 하였다. 하지만 상속은 부모클래스와 자식클래스 간의 결합도를 강하게 하도록 한다.
  * 이후에 이야기 하겠지만, 상속은 코드의 재사용이 주요 초점이 아닌 타입을 계층화 시키는 것이 더 큰 목적이다.

## 📖 챕터 11 : [상속과 코드의 재사용] 요약

## 📖 챕터 12 : [다형성] 요약

## 📖 챕터 13 : [서브클래싱과 서브타이핑] 요약
#### 상속의 용도
* 상속의 __첫번째 용도__ 는 타입계층을 구현하는 것이다.
* 상속의 __두번째 용도__ 는 코드의 재사용이다.

#### 언제 상속을 사용해야 하는가?
* 상속관계가 is-a 관계를 모델링하고 있는가?
* 클라이언트 입장에서 부모 클래스의 타입으로 자식 클래스를 사용해도 무방한가?
  * 행동의 호환성 : 클라이언트는 부모 클래스와 자식 클래스의 차이점을 몰라야 한다.
  
#### 행동 호환성
* 클라이언트가 두 타입이 동일하게 행동할 것이라고 기대한다면, 두 타입을 타입 계층으로 묶을 수 있다.
* 클라이언트가 __두 타입이 동일하게 행동하지 않을 것이라고 기대한다면__ 두 타입을 타입 계층으로 묶어서는 안된다.
  * 책에서는 새와 펭귄의 `fly` 하는 행위에 대하서 행동 호환성을 살펴보고 있다.

#### 서브클래싱과 서브타이핑
* 서브클래싱
  * 다른 클래스의 코드를 재사용할 목적으로 상속을 사용하는 경우를 가리킨다.
  * 자식 클래스와 부모 클래스의 행동이 호환되지 않기 때문에 자식 클래스의 인스턴스가 부모 클래스의 인스턴스를 대체할 수 없다.
  * 서브클래싱을 구현 상속 또는 클래스 상속이라고 부르기도 한다.
* 서브타이핑
  * 타입 계층을 구성하기 위해 상속을 사용하는 경우를 가리킨다.
  * 서브타이핑에서는 __행동이 호환__ 되기 때문에 자식 클래스의 인스턴스가 부모 클래스의 인스턴스를 대체할 수 있다.
  * 인터페이스 상속이라고 부르기도 한다.

#### 리스코프 치환 원칙 (p. 453)
* 클라이언트가 차이점을 인식하지 못한 채, 기반 클래스의 인터페이스를 통해 서브클래스를 사용할 수 있어야 한다.


