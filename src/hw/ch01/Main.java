package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20231009 선비");
        //Step4: Main 클래스 수정
        //4-1. 책 데이터 추가
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        // for (Book book: bookShelf) {
        //     System.out.println(book.getName());
        // }
        // System.out.println();

        //Step4: Iterator 사용
        //4-2. 장르 필터 Iterator 테스트
        Iterator<Book> it1 = bookShelf.iteratorByGenre("역사");
        System.out.println("장르별 책 목록:");
        while (it1.hasNext()) {
            System.out.println(it1.next().getName());
        }
        System.out.println();
        
        //4-3. 출판 연도 역순 Iterator 테스트
        Iterator<Book> it2 = bookShelf.iteratorByYear();
        System.out.println("출판 연도 역순 책 목록:");
        while (it2.hasNext()) {
            Book book = it2.next();
            System.out.println(book.getYear() + "년 책: " + book.getName());
        }

    }
}
