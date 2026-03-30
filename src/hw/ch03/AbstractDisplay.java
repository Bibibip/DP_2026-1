package hw.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //Step 1: 반복 횟수 제어 기능 추가
    public int repeatCount;

    // 생성자에서 반복 횟수를 인자로 받도록 확장
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    // 반복 횟수가 없을 경우 기본값 5 사용
    public AbstractDisplay() {
        this.repeatCount = 5;
    }

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final void display() {
        open();
        // display에서 필드값을 사용하도록 변경
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
