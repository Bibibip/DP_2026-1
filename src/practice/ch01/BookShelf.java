package practice.ch01;

import java.util.Iterator;  //JDK에서 제공하는 Iterator 인터페이스를 사용하기 위해 import
//Iterable은 자동을 impoer됨
public class BookShelf implements Iterable<Book> {
//public class BookShelf {
    private Book[] books;   //책꽂이가 책을 가지고 있음 (배열로 여러 권 관리) - 배열 선언
    private int last = 0;   //책의 마지막 위치

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize]; //책꽂이의 최대 크기 - 배열 생성
    }

    public Book getBookAt(int index) {  //책을 가져오는 메소드
        return books[index];    //배열에서 index 위치의 책을 반환
    }

    public void appendBook(Book book) { //책을 추가하는 메소드
        this.books[last] = book;    //마지막 위치에 책 넣어주기
        last++; //마지막 위치 이동
    }

    public int getLength() {    //책의 개수를 반환하는 메소드
        return last;
    }

    @Override
    public Iterator<Book> iterator() {  //자기자신(현재 책꽂이)의 Iterator를 생성해서 반환하는 메소드
        return new BookShelfIterator(this); //this는 현재 객체(책꽂이)를 가리킴
    }
}
