package li.pattern.action.iterator.practice;

import li.pattern.action.iterator.example.Aggregate;
import li.pattern.action.iterator.example.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf2 implements Aggregate {

    private List<Book> books;
    private int maxSize;

    public BookShelf2(int maxSize) {
        books = new ArrayList<Book>();
        this.maxSize = maxSize;
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        if (maxSize > books.size()) {
            books.add(book);
        } else {
            System.out.println("已超出设置的最大值，无法继续添加");
        }
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelf2Iterator(this);
    }
}
