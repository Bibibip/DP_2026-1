package practice.ch11;

public abstract class Entry {
    // 이름과 사이즈는 자식들이 다르게 구현
    // 이름을 얻는다
    public abstract String getName();

    // 크기를 얻는다 
    public abstract int getSize();

    // printList(): 메소드 오버로딩 (이름은 같은데 다른 역할)

    // 목록을 표시한다 (인자 없는 경우)
    public void printList() {
        printList("");  //null 문자열로 실행
    }

    // prefix를 앞에 붙여서 목록을 표시한다 (인자 있는 경우)
    protected abstract void printList(String prefix);

    // 문자열 표시 
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
