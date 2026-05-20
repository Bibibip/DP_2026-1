package hw.ch17;
// step 2: EvenNumberGenerator 구현

public class EvenNumberGenerator extends NumberGenerator {
    private int number;    // 현재 수
    private int end;       // 종료값

    public EvenNumberGenerator(int start, int end) {
        // 예외처리
        if (start % 2 != 0) {
            throw new IllegalArgumentException("시작값(start)은 짝수여야 합니다!");
        }
        this.number = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
}
