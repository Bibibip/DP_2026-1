package practice.ch01;

import java.util.Iterator;  //JDK에서 제공하는 Iterator 인터페이스를 사용하기 위해 import
import java.util.NoSuchElementException;
                                            //제너릭이므로 <Book>을 원소타입으로 받음
public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;    //책꽂이를 가지고 있음(마름모로 표현)
    private int index;  //책꽂이에서 현재 위치

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0; //위치 초기화
    }

    @Override   //부모의 메소드를 재정의한다는 것을 명시적으로 나타내는 어노테이션
    public boolean hasNext() {  //책꽂이에서 꺼내올 다음 책이 있는지 확인하는 메소드
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Book next() {    //책꽂이에서 다음 책을 꺼내오는 메소드
        if (!hasNext()) {   //다음에 가져올 책에 없으면
            throw new NoSuchElementException(); //예외 발생 - 더 이상 가져올 책이 없다는 것을 알림
        }
        Book book = bookShelf.getBookAt(index); //책이 있으면 꺼내옴
        index++;
        return book;
    }
}
