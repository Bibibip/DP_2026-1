package hw.ch02;

//Step3: Main 클래스 생성
public class Main {
    public static void main(String[] args) {
        Charger charger = new KoreanOutletAdapter();
        Smartphone smartphone = new Smartphone(charger);
        smartphone.charge();
    }
}
