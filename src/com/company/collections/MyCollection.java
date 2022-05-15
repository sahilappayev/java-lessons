package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollection<E> implements Iterable<E> {

    private ArrayList<E> collection;

    public MyCollection(ArrayList<E> collection) {
        this.collection = collection;
    }


    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(collection);
    }


    class MyIterator<T> implements Iterator<T> {

        private ArrayList<T> collection;
        private int index = 0;

        public MyIterator(ArrayList<T> collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return collection.size() > index;
        }

        @Override
        public T next() {
            T t = collection.get(index);
            index++;
            return t;
        }
    }

}
