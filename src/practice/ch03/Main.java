package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H');
        AbstractDisplay d1 = new CharDisplay('H'); //부모 타입의 객체 써도 가능
        d1.display();
       // d1.open();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();       

    }

}
