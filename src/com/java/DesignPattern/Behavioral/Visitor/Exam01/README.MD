# Visitor Pattern(비지터 패턴)

#### 다양한 객체에서 새로운 기능을 추가해야 한느데 캡슐화가 별로 중요하지 않은 경우 Visitor 패턴에서는 요소 클래스의 실행 알고리즘을 변경하는 visitor 클래스를 사용합니다.
#### 이러한 방식으로 요소의 실행 알고리즘은 방문자가 다양 할때 달라질 수 있습니다. 이패턴은 행동 패턴 카테고리에 포함됩니다. 패턴에 따라 객체는 방문자 객체가 요소 객체에 대한 작업을 처리하도록 방문자 객체를 받아들여야 합나디.


## Implementation
#### Accept operation을 정의하는 ComputerPart 인터페이스를 만들겠습니다. 키보드, 마우스 모니터 및 컴퓨터는 ComputerPart 인터페이스를 구현하는 구체적인 클래스입니다.
#### 방문자 클래스 작업을 정의 할 다른 인터페이스인 ComputerPartVisitor를 정의할것입니다. 컴퓨터는 구체적인 방문자를 사용하여 해당 작업을 수행합니다.
#### VisitorPatternDemo, 우리 데모 클래슨는 Computer, ComputerPartVisitor 클래스를 사용하여 방문자 패턴의 사용을 시연합니다.
![](https://www.tutorialspoint.com/design_pattern/images/visitor_pattern_uml_diagram.jpg)

https://kunoo.tistory.com/entry/%ED%96%89%EC%9C%84-%ED%8C%A8%ED%84%B4-Visitor-pattern-%EB%B9%84%EC%A7%80%ED%84%B0-%ED%8C%A8%ED%84%B4