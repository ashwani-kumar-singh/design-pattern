package behavioral.iterator.aggregator;

import behavioral.iterator.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
