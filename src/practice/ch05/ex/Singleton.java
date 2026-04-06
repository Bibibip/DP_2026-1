package practice.ch05.ex;

// 다른 방법의 singleton 패턴 구현하기
public class Singleton {
    private static Singleton singleton = null;  //null을 넣었기 때문에 아직 안 만들고 getInstance가 호출될 때 singleton이 null이면 호출

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 인스턴스가 생성될 때 시간을 지연시킴
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {    // 처음 호출되는지 검사
            singleton = new Singleton();
        }
        return singleton;   //그 다음부터는 새로 안 만들고 return만 함
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초쉼
        } catch (InterruptedException e) {
        }
    }
}
