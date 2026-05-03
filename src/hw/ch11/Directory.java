package hw.ch11;
import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    // 과제 요구사항: 키워드 포함 검색 결과 추상 메소드 구현
    @Override
    public List<Entry> search(String keyword){
        List<Entry> result = new ArrayList<>();
        if (name.contains(keyword)) {
            result.add(this);
        }
        for (Entry entry: directory) {
            result.addAll(entry.search(keyword));
        }
        return result;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);
        }
    }

    public Entry add(Entry entry) {
        directory.add(entry);
        entry.setParent(this); // 자식 엔트리에게 부모(현재 디렉토리)를 설정 (자식과 부모 연결)
        return this;
    }
}
