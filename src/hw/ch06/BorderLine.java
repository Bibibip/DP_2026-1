package hw.ch06;
import hw.ch06.framework.Product;

// 과제 요구사항: BorderLine 클래스 구현

public class BorderLine implements Product {
    private char borderChar;

    // 1. 생성자: 경계 문자를 인자로 받음
    public BorderLine(char borderChar){
        this.borderChar = borderChar;
    }

    // 2 use() 메소드 구현
    @Override
    public void use(String s){
        // 위쪽 라인 출력 (s.length() 만큼)
        for (int i = 0; i < s.length(); i++) {
            System.out.print(borderChar);
        }
        System.out.println(); // 줄바꿈

        // 본문 출력 (텍스트 그대로)
        System.out.println(s);
        
        // 아래쪽 라인 출력 (s.length() 만큼)
        for (int i = 0; i < s.length(); i++) {
            System.out.print(borderChar);
        }
        System.out.println(); // 줄바꿈
    }

    // 3. createCopy() 메소드 구현 (clone() 활용)
    @Override
    public Product createCopy() {
        // 기존 클래스와 동일하게 구현
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
