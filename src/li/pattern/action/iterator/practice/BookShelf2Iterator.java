package li.pattern.action.iterator.practice;

import li.pattern.action.iterator.example.Book;

import java.util.Iterator;

public class BookShelf2Iterator implements Iterator {

    private BookShelf2 bookShelf2;
    private int index;
    public BookShelf2Iterator(BookShelf2 bookShelf2) {
        this.bookShelf2 = bookShelf2;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf2.getLength()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf2.getBookAt(index);
        index++;
        return book;
    }

    @Override
    public void remove() {
        bookShelf2 = null;
    }
}
