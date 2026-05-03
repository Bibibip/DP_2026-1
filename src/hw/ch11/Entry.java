package hw.ch11;
import java.util.List;

public abstract class Entry {
    private Entry parent;

    // 과제 요구사항: 키워드 포함 검색 결과 추상 메소드 추가
    public abstract List<Entry> search(String keyword);

    // 부모를 설정한다
    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    // 이름을 가져온다 
    public abstract String getName();

    // 크기를 가져온다 
    public abstract int getSize();

    // 목록을 표시한다 
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여 목록을 표시한다
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    // 전체 경로를 가져온다 
    public String getFullName() {
        StringBuilder fullname = new StringBuilder();
        Entry entry = this;
        do {
            fullname.insert(0, entry.getName());
            fullname.insert(0, "/");
            entry = entry.parent; // 부모로 이동 (트리의 윗방향)
        } while (entry != null);
        return fullname.toString();
    }
}
