package practice.ch05.ex;

public class Main extends Thread{   //Tread는 JDK에서 제공하는 클래스, Thread 클래스를 상속받아서 Main 클래스가 Thread가 됨
    public static void main(String[] args) {
        // 스레드 생성 (멀티스레드)
        Main t1 = new Main("Thread-A");
        Main t2 = new Main("Thread-B");

        // 스레드에 시작 지시
        t1.start(); //스레드가 해야 할 일을 작성한 run() 메소드가 자동으로 실행됨
        t2.start();
    }

    //스레드가 해야 할 일을 작성 (singleton에 getInstance 호출)
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(getName() + ": " + s);   // 스레드 이름과 싱글턴 인스턴스의 주소값 출력
    }

    public Main(String name){
        super(name); //부모인 Thread의 생성자를 호출해서 스레드 이름 설정
    }
}
