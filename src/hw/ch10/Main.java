package hw.ch10;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("20231009, 선비");
        
        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));
        
        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // CyclicStrategy 테스트: 순환 확인
        System.out.println("=====CyclicStrategy 의 손가락 순환=====");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);
            cyclic.study(false); // study 호출해도 영향 없음
        }


        System.out.println("===== 게임 진행 =====");
        //게임 시키기
        for (int i=1; i<=10; i++){
            // 플레이어 2명에서 각각 손을 얻음
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();
            //손을 대결시킴
            if (h1.isStrongerThan(h2)) {
                player1.win();
                player2.lose();
                System.out.println("Winner: " + player1);
            } else if (h1.isWeakerThan(h2)) {
                player1.lose();
                player2.win();
                System.out.println("Winner: " + player2);
            } else {
                player1.even();
                player2.even();
                System.out.println("Even...");
            }
        }

        System.out.println("10번 게임 진행 결과:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
