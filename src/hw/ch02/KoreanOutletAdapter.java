package hw.ch02;

public class KoreanOutletAdapter implements Charger {
    private KoreanOutlet koreanOutlet = new KoreanOutlet();

    // Step2: KoreanOutletAdapter를 구현하여 KoreanOutlet의 'provide()'를 'charge()'로 변환
    @Override
    public int charge() {
        return koreanOutlet.provide(); // 한국 콘센트의 전압을 반환
    }
    
}
