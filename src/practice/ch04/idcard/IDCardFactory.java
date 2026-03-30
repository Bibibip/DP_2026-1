package practice.ch04.idcard;

import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    // 부모 타입은 자식 객체를 참조할 수 있다 (다형성의 핵심)
    // 부모 객체는 자식 타입이 참조할 수 없다
    protected Product createProduct(String owner) { // 실제 제품 성성
        return new IDCard(owner);

    }

    @Override
    protected void registerProduct(Product product) {   // 제품 등록
        System.out.println(product + "을 등록했습니다.");
    }
}
