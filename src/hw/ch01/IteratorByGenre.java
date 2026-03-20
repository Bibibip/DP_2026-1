package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorByGenre implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;
    //(step2) 코드 추가
    private String genre; 

    public IteratorByGenre(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
    }
    
    // step2: 지정한 장르의 책만 순회하도록 수정
    @Override
    public boolean hasNext() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            if (book.getGenre().equals(genre)) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
