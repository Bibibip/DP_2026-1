package practice.ch17;

// 관찰자를 내타내는 인터패이스
public interface Observer {
    public abstract void update(NumberGenerator generator);// 통지 받을 때 호출되는 메소드
}
