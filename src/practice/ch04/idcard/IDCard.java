package  practice.ch04.idcard;

import practice.ch04.framework.Product;
// Product는 다른 패키지에 있기 때문에 import 해줘야 함

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {  //문자열 + 문자열, 직접 생성하지 못하게 하려고 앞에 public 안 씀
        // 부모의 인자 없는 생성자를 호출함
        // super(); 생략가능
        //부모의 인자 있는 생성자를 호출하려면 super("x", "y") 이런 식으로
        // 중요한 것은 super()를 첫 문장에 적어야 함!
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }
    //product에 선언된 use() 구현
    @Override
    public void use() {     //객체 + 문자열 -> 컴파일러가 자동으로 .toString() 호출(즉, this.toString))
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    // Object 클래스의 toString() 메소드 오버라이드
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
