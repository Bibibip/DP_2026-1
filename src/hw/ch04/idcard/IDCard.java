package  hw.ch04.idcard;
import hw.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    // Step 1: 필드 추가 및 생성자 수정
    private String issuedDate;

    IDCard(String owner, int serial, String issuedDate) {  
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
    }
    
    //product에 선언된 use() 구현
    @Override
    public void use() {     //객체 + 문자열 -> 컴파일러가 자동으로 .toString() 호출(즉, this.toString))
        System.out.println(this + "을 사용합니다.");
    }
    
    // step 1: 발급 날짜 포함하여 출력
    @Override   
    public String toString() {
        return "[IDCard: " + owner + " (" + serial + ") " + "issuedDate: " + issuedDate + "]";
    }

    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
    //step 1: 발급 날짜 getter 추가
    public String getIssuedDate() {
        return issuedDate;
    }

}
