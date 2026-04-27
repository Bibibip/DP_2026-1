package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>(); // 자식들을 보관하는 리스트, Entry: 부모 타입(Directory와 File 모두 담을 수 있음)

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {  // 모든 자식의 크기를 더함
        int size = 0;   // 반드시 0으로 초기화한 후에!!!
        for (Entry entry: directory) {  // 형식 (원소 변수: 컬렉션)
            size += entry.getSize();    // 자식에 대해서 사이즈 호출
        }       // getSize() 호출했더니 또 getSize() 호출.. => 재귀적 호출 (꺼내온 애가 폴더이면 자식들에 대해서 또 호출...)
        return size;
    }

    @Override
    protected void printList(String prefix) {   // prefix는 이 디렉토리의 이전 경로(앞까지의 경로)
        System.out.println(prefix + "/" + this);    
        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name);   // 이 폴더까지 포함한 경로를 자식(entry)에게 전달 (자기 경로까지 포함)
        }   // 자기가 가지고 있는 자식에 대해서 또 printList() 호출 => 재귀적 호출
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) { // 부모 타입으로 선언 > 디렉토리, 파일 모두 가능
        directory.add(entry);
        return this;
    }
}
