package hw.ch17;

public class Main {
    public static void main(String[] args) {
        System.out.println("20231009, 선비");
        
        EvenNumberGenerator evenGenerator = new EvenNumberGenerator(0, 30);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();   
        Observer observer3 = new RangeObserver();
        evenGenerator.addObserver(observer1);
        evenGenerator.addObserver(observer2);
        evenGenerator.addObserver(observer3);

        evenGenerator.execute();
    }
}
