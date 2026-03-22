package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorByYear implements Iterator<Book> {
    private Book[] sortedBooks; // 최신 순으로 정렬하기 위한 배열 선언
    private int index;

    // step2: BookShelf에서 해당 장르의 책들을 가져와 최신 순으로 정렬하는 생성자 추가
    public IteratorByYear(BookShelf bookShelf) {
        sortedBooks = new Book[bookShelf.getLength()];
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }
        // 최신 순으로 정렬
        for (int i=0; i < sortedBooks.length-1; i++){
            for (int j=0; j < sortedBooks.length-1-i; j++){
                if (sortedBooks[j].getYear() < sortedBooks[j+1].getYear()) {
                    Book temp = sortedBooks[j];
                    sortedBooks[j] = sortedBooks[j+1];
                    sortedBooks[j+1] = temp;
                }
            }
        }
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks[index++];
    }
}
