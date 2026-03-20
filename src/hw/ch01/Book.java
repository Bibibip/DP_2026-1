package hw.ch01;

public class Book {
    private String name;
    //Step1: Book 클래스 확장
    private String genre; //장르: "소설", "과학", "역사", "기술" 등
    private int year; //출판 연도(예: 2008)
    private double price; //가격 (단위: 원, 예: 30000.0)
    
    public Book(String name) {
        this.name = name;
    }

    // 새 필드를 받는 생성자 오버로딩으로 추가
    public Book(String name, String genre, int year, double price){
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    //(Step1): 코드 추가 부분
    public String getGenre() {
        return genre;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
}
