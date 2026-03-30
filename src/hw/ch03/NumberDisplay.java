package hw.ch03;

// step2 : 새로운 Display 구현체 추가

public class NumberDisplay extends AbstractDisplay {
    private int number; // 표시해야 하는 숫자

    // 생성자
    public NumberDisplay(int number) {
        super();    // 부모 클래스의 기본 생성자 호출(반복횟수 없을 경우)
        this.number = number;
    }
    //step 1: 반복횟수 받을 수 있도록 생성자 추가
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount); // 부모 클래스의 생성자 호출
        this.number = number;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        // 필드에 기억해 둔 문자를 1 줄에 1회 표시한다 
        System.out.println(number);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("<<Number>>");
    }
}
