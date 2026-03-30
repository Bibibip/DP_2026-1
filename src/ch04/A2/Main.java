package ch04.A2;

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        System.out.println("\n=== 카드 사용 ===");
        card1.use();
        card2.use();
        card3.use();

        System.out.println("\n=== 시리얼 번호와 오너 쌍 ===");
        ch04.A2.idcard.IDCard id1 = (ch04.A2.idcard.IDCard) card1;
        ch04.A2.idcard.IDCard id2 = (ch04.A2.idcard.IDCard) card2;
        ch04.A2.idcard.IDCard id3 = (ch04.A2.idcard.IDCard) card3;
        System.out.println("Serial: " + id1.getSerial() + ", Owner: " + id1.getOwner());
        System.out.println("Serial: " + id2.getSerial() + ", Owner: " + id2.getOwner());
        System.out.println("Serial: " + id3.getSerial() + ", Owner: " + id3.getOwner());
    }
}
