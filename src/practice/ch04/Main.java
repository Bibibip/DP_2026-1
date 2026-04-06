package practice.ch04;

//import practice.ch04.idcard.IDCard;
import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // (1) IDCard를 직접 생성
        // IDCard c1 = new IDCard("선비");
        // c1.use();

        // (2) 공장을 통해서 IDCard 생성
        IDCardFactory factory = new IDCardFactory();
        Product c2 = factory.create("선비"); //factory.create()이 반환하는 것은 Product 클래스
        c2.use();

    }
}
