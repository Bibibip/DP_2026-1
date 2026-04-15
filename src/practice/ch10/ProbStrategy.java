package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;  //이전에 냈던 손의 값
    private int currentHandValue = 0;   // 바로 직전에 냈던 손의 값
    private int[][] history = { // 정수가 들어가는 2차원 배열
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {            // 바로 직전에 냈던 손
        int bet = random.nextInt(getSum(currentHandValue)); //합이 15면 0~14 사이의 난수를 발생시킴
        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;  // 0~2 사이의 난수가 나오면 0(주먹)을 선택
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;  // 3~7 사이의 난수가 나오면 1(가위)을 선택
        } else {
            handvalue = 2;  // 8~14 사이의 난수가 나오면 2(보)를 선택
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];   //행 번호는 고정, 열 번호가 0,1,2로 바뀜 => 그 행의 값을 다 더함
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {  // 이겼으면
            history[prevHandValue][currentHandValue]++;
        } else {  // 졌으면 나머지 칸에 1을 더함
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
