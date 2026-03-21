package practice.ch02.deligation;

//어댑터
//자바에서는 다중 상속이 불가능함(부모가 둘 이상을 허용이 안됨)
public class PrintBannerAdapter02 extends Print {
    private Banner banner; // Banner 클래스의 인스턴스를 참조하는 필드

    public PrintBannerAdapter02(String text){
        this.banner = new Banner(text); // Banner 클래스의 인스턴스를 생성하여 필드에 할당
    }

    //부모로부터 선언된 것 구혐
    @Override
    public void printWeak()
    {
        banner.showWithParen(); // Banner 클래스의 메서드를 호출하여 기능을 수행(Banner에게 위임)
    }

    @Override
    public void printStrong()
    {
        banner.showWithAster(); // Banner 클래스의 메서드를 호출하여 기능을 수행
    }
    
}
