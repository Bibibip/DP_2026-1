package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Comparator;

public class IteratorByYear implements Iterator<Book> {
    private Book[] sortedBooks; // 최신 순으로 정렬하기 위한 배열 선언
    private int index;

    // step2: BookShelf에서 책들을 가져와 최신 순으로 정렬하는 생성자 추가
    public IteratorByYear(BookShelf bookShelf) {
        this.sortedBooks = new Book[bookShelf.getLength()];
        this.index=0;

        for (int i = 0; i< bookShelf.getLength(); i++) {
            sortedBooks[i] = bookShelf.getBookAt(i);
        }

        // 최신 순으로 정렬하기 위해 Comparator를 사용
        Arrays.sort(sortedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b2.getYear() - b1.getYear(); // 최신 순으로 정렬하기 위해 b2와 b1의 연도를 비교
            }
        });
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
