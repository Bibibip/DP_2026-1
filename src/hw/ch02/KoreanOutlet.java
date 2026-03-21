package hw.ch02;

//Step1: KoreanOutlet은 provide()를 사용하고, Charger는 charge()를 요구하므로 
//provide()를 charge()로 변환하는 어댑터가 필요하다.
public class KoreanOutlet {
    //한국 표준 전원: 220V AC
    public int provide(){
        System.out.println("한국 콘센트에서 220V AC를 제공합니다.");
        return 220; //220V
    }
}
