package ch04.A2;

import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        card1.use();
        card2.use();
        card3.use();
        
        String owner = factory.getDatabase().get(100); //100번 시리얼 번호의 오너 이름 가져오기
        System.out.println("시리얼 번호 100의 오너: " + owner);
        
    }
}
