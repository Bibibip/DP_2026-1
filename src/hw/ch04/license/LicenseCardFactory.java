package hw.ch04.license;
import java.util.HashMap;
import java.util.Map;

import hw.ch04.license.LicenseCard;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter=100;
    private String baseDate;
    private Map<Integer, String> database = new HashMap<>(); 

    public LicenseCardFactory(String baseDate){
        this.baseDate = baseDate;
    }

    @Override
    protected synchronized Product createProduct(String holder) {
        return new LicenseCard(holder, licenseCounter++, baseDate, "2031-03-19");
    }

    @Override
    protected void registerProduct(Product product) {
        LicenseCard card = (LicenseCard) product;
        database.put(card.getLicenseNumber(), card.getHolder());    //licenseNumber를 키로, holder를 값으로 저장
        System.out.println(product + "을 등록했습니다.");
    }
}
