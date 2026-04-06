package ch05.A1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
            // 위 문장을 만나는 순간 메모리에 TicketMaker 클래스 로드
        }
        System.out.println("End.");
    }
}
