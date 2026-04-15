package practice.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;  //  이전에 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 이전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3));
            // 0~2 사이의 난수를 발생시켜서 Hand.getHand() 메소드에 넘겨서 손을 얻음
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
