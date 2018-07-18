package li.pattern.action.iterator.genericity;

import java.util.Iterator;

public class ConcreteIterator<T> implements Iterator {

    private ConcreteAggregate concreteAggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index > concreteAggregate.getLength() - 1) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        T obj = (T) concreteAggregate.get(index);
        index++;
        return obj;
    }

    @Override
    public void remove() {

    }
}
