package ch04.A2.idcard;


import java.util.HashMap;
import java.util.Map;   

import ch04.A2.framework.Factory;
import ch04.A2.framework.Product;   

public class IDCardFactory extends Factory {
    private int serial = 100;   //시리얼 번호 관리 (첫 번째 번호 100번) - 정수 기본 데이터 타입
    private Map<Integer, String> database = new HashMap<>(); // 정수 객체

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++); //다음 번에 호출되면 101
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product; // 다운 캐스팅 (Product -> IDCard) (getSerial, getOwner는 IDCard에만 있기 때문에)
        database.put(card.getSerial(), card.getOwner());    //serial을 키로, owner를 값으로 저장
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
