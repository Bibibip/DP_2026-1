package practice.ch17;

// 관찰자
// 관찰자도 관찰대상이 무엇인지 구체적으로 신경쓰지 않음(NumberGenerator의 자식이라는 것만 알고 있음)
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 통지받을 떄 호출되는 메소드
        System.out.println("DigitObserver:" + generator.getNumber());   
        try {
            Thread.sleep(1000);  // 1초 대기
        } catch (InterruptedException e) {  // sleep 실패 시 예외     
        }
    }
}
