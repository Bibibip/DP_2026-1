package hw.ch12;

public class NumberedBorder extends Border{
    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 4; // 번호와 괄호를 위한 공간 추가
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return String.format("%2d| %s", row + 1, display.getRowText(row));
    }
}
