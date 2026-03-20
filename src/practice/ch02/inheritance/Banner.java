package practice.ch02.inheritance;

//이미 존재하는 클래스, Vendor 클래스, 강아지(멍멍() 제공), 수정할 수 없음!
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }
    //아래 메소드 이름이 마음에 안 듦...Print 인터페이스를 구현하고 싶어
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
