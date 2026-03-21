package hw.ch02;

//Step3: Smartphone 클래스 생성
public class Smartphone {
    private Charger charger;

    public Smartphone(Charger charger){
        this.charger = charger;
    }

    public void charge(){
        int voltage = charger.charge();
        System.out.println("스마트폰이 " + voltage + "V에서 충전합니다.");
    }
}
