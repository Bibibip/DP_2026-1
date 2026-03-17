package ch01.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;
            //인터페이스(부모 타입으로 생성)
    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);    //배열로 했을 떄는 books[index]였음
    }

    public void appendBook(Book book) {
        books.add(book);    //필요하면 자동으로 크기가 늘어남(ArrayList의 특징)
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}
