# 프로토타입 패턴

`prototype pattern`은 생산적인 디자인 패턴 중에 하나로써, 패턴내에서 object의 생성을 제공해준다.
`prototype pattern`은 object 생성이 높은 비용으로 수 많은 요청을 하는 경우, 또는 비슷한 object를 지속적으로 생성해야 할 때 유영하게 사용할수 있다.
`prototype pattern`은 본래의 object로부터 새로운 object를 만들어내며 (서로 다른 인스턴스), 각 객체에 따라 데이터 수정이 가능한 메커니즘을 제공한다.

이 패턴은 예제와 함께 보면 쉽게 이해할수 있다. 우리가 db로부터 데이터를 가져온 경우를 생각해보자. 프로그램내에서 여러번 데이터 수정이 이루어진다고 할 때, 똑같은 데이터를 매번 db에서 가져오는 것은 좋은 생각이 아니다.
`prototype pattern`은 이런 문제점을 해결하기 위해 원래의 object의 property들을 확인하여 deep 또는 shallow copy(얕은 카피)를 시도하여 clone object를 제공해준다.

