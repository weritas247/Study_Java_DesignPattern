#책임 연쇄 패턴/역할 사슬 패턴


*용도
어떤 요구가 발상했을 때, 그 요구를 처리할 Object를 바로 결정할 수 없을 때, 다수의 Object를 Chain으로 연결해
차례로 방문하면서 목적에 맞는 Object를 결정함(내가 못하면 남한테 전가시킴)
*사용방법
Handler 객체가 문제를 해결했는지 확인하면서 계속해서 가능한 객체를 연결해 줌.

![](https://realzero0.github.io/assets/img/corpattern.png)

https://realzero0.github.io/study/2017/06/12/디자인-패턴-정리.html#10-책임-연쇄-패턴chain-of-responsibility-pattern