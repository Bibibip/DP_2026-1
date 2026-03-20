package practice.ch02.deligation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hellov World");
        print.printWeak();
        print.printStrong();
    }
}
