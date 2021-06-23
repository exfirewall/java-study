>OOP의 4가지 특성은 주방용퓸, SOLID는 주방용품 사용설명서이며 디자인패턴은 요리 레시피이다.

# 디자인 패턴
디자인 패턴이란, 자주 사용하는 설계 패턴을 정형화해서 이를 유형별로 가장 최적의 방법으로 개발을 할 수 있도록 정해둔 설계이다. <br>
여러 사람이 협업을 진행해야 할 때 다른 사람이 작성해놓은 코드를 단번에 이해하기란 매우 어렵다. <br>
디자인 패턴은 의사소통 수단의 일종으로 이러한 문제를 어느정도 해결해준다. <br>

## 싱글턴 패턴 ( Singleton )
생성자가 여러 차례 호출되더라도 실제로 생성되는 객체는 하나이고 최초 생성 이후에 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다. <br>
TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용한다.

[싱글턴 패턴 문제점과 해결책](https://velog.io/@kyle/%EC%9E%90%EB%B0%94-%EC%8B%B1%EA%B8%80%ED%86%A4-%ED%8C%A8%ED%84%B4-Singleton-Pattern#%ED%95%B4%EA%B2%B0)

## 어댑터 패턴 ( Adapter )
실생활에서 돼지코 변환기를 생각하면 쉽다. 호환성이 없는 기존 클래스의 인터페이스를 변환하여 코드 재사용률을 높이는 패턴이다. 개방폐쇄 원칙(OCP)를 따른다.

InputStreamReader가 어댑터 패턴이다.

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```
위 코드를 풀어쓰면 다음과 같다.
```java
InputStream inputstream = System.in;
InputStreamReader sr = new InputStreamReader(inputstream);
BufferedReader br = new BufferedReader(sr);
```
Byte type = InputStream
Char type = InputStreamBuffer
Char type의 직렬화 = BufferedReader
InputStreamBuffer가 byte type을 char type으로 바꿔주어 BufferedReader가 문자열을 return해주는 방식이다.
## 프록시 패턴 ( Proxy )
Proxy는 대리인 이라는 뜻으로, 뭔가를 대신해서 처리하는 것이다. Proxy Class를 통해서 대신 전달하는 형태로 설계되며, 실제 Client는 Proxy로부터 결과를 받는다. <br>
Cache의 기능으로도 활용이 가능하다. 개방폐쇄 원칙(OCP)과 의존역전 원칙(DIP)를 따른다.

## 데코레이터 패턴 ( Decorator )
객체의 결합을 통해 기능을 동적으로 유연하게 확장해주는 패턴이다. <br>
가정 : 기본 차선 표시 기능을 제공하는 클래스가 있다하자. <br>
문제상황 : 여기에 차선, 교차로, 교통량을 추가로 표시하고자한다. 이때 각각의 기능별로 기본 차선 표시 클래스를 상속받아 추가로 클래스를 추가해야한다.<br>
해결책 : 각 추가 기능별로 개별적인 클래스를 설계하고 기능을 조합할 때 각 클래스의 객체 조합을 이용하면 된다.<br>
이럴때 사용하는 패턴이 데코레이터 패턴이다.

## 옵저버 패턴 ( Observer )
변화가 일어났을 때, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다. 예를 들어 event listenr가 이에 해당된다.

## 퍼사드 패턴 ( Facade )
어떤 서브시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공한다. <br>
퍼사드에서 고수준 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용할수 있다.

## 전략 패턴 ( Strategy )
객체가 할 수 있는 행위들 각각을 전략으로 만들어 놓고, 동적으로 행위의 수정이 필요한 경우 전략을 바꾸는 것만으로 행위의 수정이 가능하도록 만든 패턴이다.
