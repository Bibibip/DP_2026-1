package hw.ch03;

public class Main {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d1 = new CharDisplay('H');

        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만든다 
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        // step 3: Main 클래스 수정
        AbstractDisplay num = new NumberDisplay(42, 4);

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다
        System.out.println("20231009 선비");
        System.out.println();
        
        d1.display();
        d2.display();
        num.display();
    }
}
