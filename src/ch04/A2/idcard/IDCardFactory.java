package ch04.A2.idcard;


import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;   //시리얼 번호 관리 (첫 번째 번호 100번) - 정수 기본 데이터 타입

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++); //다음 번에 호출되면 101
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
