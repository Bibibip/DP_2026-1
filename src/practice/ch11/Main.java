package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 디렉터리 트리를 만든다
        //Directory root = new Directory("root");
        // 업캐스팅은 자동으로 일어남(부모 타입으로 선언)
        Entry root = new Directory("root");   // 부모 타입으로 선언 > 디렉토리, 파일 모두 가리킬 수 있음
        //그러나 아래 add()에서 에러...Entry는 add 메소드가 없기 때문!!!
        //컴파일러 입장에서는 뭐가 들어있냐가 아니라 타입이 중요함!
        // 그래서 부모 타입으로 선언한 경우에는 부모 타입에서 정의된 메소드만 사용할 수 있음
        // 해결방법: 형변환 (Directory)root.add(bin);  // add()는 Directory에 정의된 메소드이므로 형변환 필요

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        
        // 다운캐스팅
        ((Directory)root).add(bin); // . 연산자가 타입캐스팅 연산자보다 우선 순위 높으므로 괄호
        //root.add(tmp);
        //root.add(usr);

        // 파일 생성 및 추가
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));


        // 디렉토리 리스트 출력
        root.printList();
    }
}
