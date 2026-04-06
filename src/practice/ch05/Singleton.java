package practice.ch05;

// 싱글톤 패턴 적용하기
public class Singleton {

    // (3) Singleton 객체를 미리 하나 만들어 둠
    private static Singleton singleton = new Singleton(); // 클래스가 로딩될 때 singleton 객체가 하나 만들어지고 그때 getInstance 반환?

    // (1) 생성자를 private으로 함
    private Singleton(){
        System.out.println("Singleton 객체가 생성됩니다");
    }

    // (2) Singleton 객체를 얻어갈 수 있는 메소드를 정의함
    public static Singleton getInstance(){
        return singleton;
    } 
        // static이 없으면 객체가 만들어져야 호출할 수 있는데 생성자가 private이므로 메소드를 호출할 수가 없음
        // static을 써서 객체를 만들지 않아도 호출할 수 있도록 해야함

}
