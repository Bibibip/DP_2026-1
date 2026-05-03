package practice.ch12;

// 중심 컴포넌트 (문자열 표시)
public class StringDisplay extends Display {
    private String string; // 표시 문자열 : "Hello, world."

    // DIsplay의 추상메소드들 구현
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length(); // 문자열의 Columns니까 문자열 길이와 같음
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) { // 현재 문자열 행이 1개이므로 row가 0이 아니면 인덱스 범위 벗어난 것.
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string;
    }
}
