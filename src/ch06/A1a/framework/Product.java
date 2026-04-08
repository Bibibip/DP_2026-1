package ch06.A1a.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String s);
    // 이거 추가하면서 인터페이스가 추상 클래스로 바뀜
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
