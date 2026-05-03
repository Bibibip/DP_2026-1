package practice.ch12;

// 장식자를 대표하는 클래스
public abstract class Border extends Display {
    protected Display display;             // 이 장식틀이 감싸는 '내용물'(장식 대상)
    // Display는 부모 타입이므로 그 밑에 있는 것은 누구든지 장식할 수 있다

    // 생성자
    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
