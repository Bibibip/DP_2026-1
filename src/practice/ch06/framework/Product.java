package practice.ch06.framework;

public interface Product extends Cloneable {    // 인터페이스끼리는 상속할 수 있음
//public interface Product  {    // 인터페이스끼리는 상속할 수 있음
    public abstract void use(String s);
    public abstract Product createCopy();   // 복제 메소드(프로토타입의 핵심)
}
