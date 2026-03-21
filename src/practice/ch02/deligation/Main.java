package practice.ch02.deligation;

public class Main {
    public static void main(String[] args) {
        //부모 타입으로 선언 -> 메소드 호출할 때, Print에 있는 것만 호출 가능
        //즉, 만약 PrintBannerAdapter02 타입으로 선언했다면, PrintBannerAdapter02에민 있는 메소드도 접근 가능하나, 
        //부모 타입인 Print 타입으로 선언했기 때문에, Print에 있는 메소드만 접근 가능
        Print print = new PrintBannerAdapter02("Hellov World");
        print.printWeak();
        print.printStrong();
        //((PrintBannerAdapter02)print).getYourName(); // 형 변환(타입캐스팅)을 통해 PrintBannerAdapter02의 메소드에 접근 가능
        //괄호로 안 묶어주면 .이 우선순위가 높기 때문에 안됨
    }
}
