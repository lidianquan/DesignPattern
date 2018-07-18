package li.pattern.action.iterator.genericity;

import java.util.Iterator;

public interface Aggregate<T> {

    void add(Object o);

    Object get(int index);

    void remove(T obj);

    Iterator<T> iterator();

}
