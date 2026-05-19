package practice.ch19;

public class Main {
    public static void main(String[] args) {
        // GUI 생성
        SafeFrame frame = new SafeFrame("금고 경비 시스템");

        // 시계 역할 구현
        // 1초마다 현재 시간을 얻어서 SafeFrame의 setClock()에 전달
        // Thread.sleep(1000); 1초마다~~
        while (true) {  // 무한 루프
            for (int hour = 0; hour < 24; hour++) { //하루 24시간
                frame.setClock(hour);   // 시계에서 시간 설정
                try {
                    Thread.sleep(1000);    // 1초마다 (1초 기다림)
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
