package hw.ch04.idcard;
import java.util.HashMap;
import java.util.Map;  

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 100;   //시리얼 번호 관리 (첫 번째 번호 100번) - 정수 기본 데이터 타입
    private Map<Integer, String> database = new HashMap<>(); // 정수 객체
    // step 1: 발급 날짜 관리 위한 필드 추가
    private String baseDate;

    // step 1: 생성자 수정
    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }
    
    // step 1: createProduct() 메소드 수정
    @Override
    protected synchronized Product createProduct(String owner) { // 실제 제품 성성
        return new IDCard(owner, serial++, baseDate); 
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        database.put(card.getSerial(), card.getOwner());    //serial을 키로, owner를 값으로 저장
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }
}
