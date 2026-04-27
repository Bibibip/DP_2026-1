package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHandValue = 0;

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHandValue);
        currentHandValue = (currentHandValue + 1) % 3;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // 승패에 관계없이 다음 손을 순환시키므로 아무 것도 하지 않음
    }
}
