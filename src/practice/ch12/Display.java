package practice.ch12;

// 장식 대상을 나타내는 추상 클래스
public abstract class Display {
    public abstract int getColumns();           	// 가로 문자 수를 얻는다
    public abstract int getRows();              	// 세로 행수를 얻는다
    public abstract String getRowText(int row); 	// row행째 문자열을 얻는다

    // 모든 행을 표시한다 (한 행씩 출력) -> 템플릿 메소드!! (큰 흐름을 보여주며, 추상 메소드 자식들이 구현하도록)
    public void show() {    // getRows()는 세로 행의 개수만큼 출력하겠다는 뜻
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
