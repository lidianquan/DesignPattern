package li.pattern.action.iterator;

import li.pattern.action.iterator.example.Book;
import li.pattern.action.iterator.example.BookShelf;
import li.pattern.action.iterator.genericity.Aggregate;
import li.pattern.action.iterator.genericity.ConcreteAggregate;
import li.pattern.action.iterator.practice.BookShelf2;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        System.out.println("------数组模式------");
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

        System.out.println("------列表模式------");
        BookShelf2 bookShelf2 = new BookShelf2(3);
        bookShelf2.appendBook(new Book("设计模式"));
        bookShelf2.appendBook(new Book("算法"));
        bookShelf2.appendBook(new Book("数学之美"));
        bookShelf2.appendBook(new Book("线性代数"));
        Iterator it2 = bookShelf2.iterator();
        while (it2.hasNext()) {
            Book book = (Book) it2.next();
            System.out.println(book.getName());
        }

        System.out.println("------泛型模式------");
        Aggregate aggregate = new ConcreteAggregate(3);
        aggregate.add(new Book("设计模式"));
        aggregate.add(new Book("算法"));
        aggregate.add(new Book("数学之美"));
        Iterator it3 = aggregate.iterator();
        while (it3.hasNext()) {
            Book book = (Book) it3.next();
            System.out.println(book.getName());
        }

    }
}
