package practice.ch20;

public class Main {
    public static void main(String[] args) {
        // BigChar char1 = new BigChar('1');
        // char1.print();

        // BigChar char2 = new BigChar('1');
        // char2.print();

        // BigCharFactory를 이용
        BigCharFactory factory = BigCharFactory.getInstance();
        
        BigChar char3 = factory.getBigChar('1');
        char3.print();

        BigChar char4 = factory.getBigChar('1');
        char4.print();

        if (char3 == char4) {
            System.out.println("char3과 char4는 같은 인스턴스입니다.");
        } else {
            System.out.println("char3과 char4는 다른 인스턴스입니다.");
        }

        //BigString을 이용
        BigString bigString = new BigString("1212123");
        bigString.print();
    }
}
