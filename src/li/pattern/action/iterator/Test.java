package li.pattern.action.iterator;

import li.pattern.action.iterator.example.Book;
import li.pattern.action.iterator.example.BookShelf;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("设计模式"));
        bookShelf.appendBook(new Book("算法"));
        bookShelf.appendBook(new Book("数学之美"));
        bookShelf.appendBook(new Book("线性代数"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
