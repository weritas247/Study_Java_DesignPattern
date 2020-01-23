# GoF 디자인 패턴의 빌더 패턴

> Separate the construction of a complex ofbject from its representation so that the same construction process can create different representations.
>
> 복잡한 객체를 생성하는 방법과 표현하는 방법을 정의하는 클래스를 별도로 분리하여 서로 다른 표현이라도 이를 생성할 수 있는 동일한 구축 공정을 제공할수 있도록 한다.

책에 실린 번역어가 좀 어렵다. 하지만 원문과 비교해 잘 읽어보면 핵심은 다음과 같다.
+ 다음을 분리하다
    + 객체를 생성하는 방법.
    + 객체를 표현하는 방법.

참여 객체는 다음과 같다.

    * Builder: 빌더 인터페이스
    * ConcreteBuilder: 빌더 인터페이스 구현체, 부품을 합성하는 방식에 따라 여러 구현체를 만든다.
    * Director: Builder를 사용해 객체를 생성한다.
    * Product: Director가 Builder로 만들어낸 결과물.
    
builder는 부품을 만들고, director는 builder가 만든 부품을 조합해 제품을 만든다고 할 수 있다.
    
즉 다음과 같은 조합이 가능하다.

 테이블 | 평범한 방/문을 만드는 Builder | 레고로 방/문을 만드는 Builder |
 --- | --- | --- 
 아파트를 만드는 Director | 평범한 아파트 | 레고로 만든 아파트 |
 주택을 만드는 Director | 평범한 주택 | 레고로 만든 주택 |
 학교를 만드는 Director | 평범한 학교 | 레고로 만든 학교 |


     