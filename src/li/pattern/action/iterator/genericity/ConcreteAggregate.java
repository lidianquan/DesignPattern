package li.pattern.action.iterator.genericity;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {


    private List<T> list = new ArrayList<T>();
    private int maxSize;

    public ConcreteAggregate(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void add(Object o) {
        if(maxSize > list.size()) {
            list.add((T) o);
        } else {
            System.out.println("out of the maxSize");
        }
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<T>(this);
    }

    public int getLength() {
        return list.size();
    }
}
