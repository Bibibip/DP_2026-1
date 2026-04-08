package practice.ch05;

public enum Singleton2 {
    // enum 클래스는 항상 상수를 가짐
    //INSTANCE1, //클래스 로드 시 싱글톤 객체를 하나 만들어둠
    //INSTANCE2,
    //INSTANCE3;  //이건 인스턴스 3개만 생성할 경우
    INSTANCE;

    //메소드
    public void hello(){
        System.out.println("싱글톤 객체의 hello 메소드가 호출되었습니다.");
    }
}


