package com.company.collections;

public class DoublyLinkedList<E> {


    /*
    1. Singly Linked List (only next)
    2. Circular Linked List (first has prev (last) and last has next (first))
    3. Doubly Linked List
     */
    private Store<E> first;
    private Store<E> last;

    private int size = 0;

    public void add(E e) {
        Store<E> lastNode = last;
        Store<E> newNode = new Store<>(lastNode, e, null);
        if (first == null) {
            first = newNode;
        }else {
            lastNode.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void remove(int index){
        Store<E> current = get(index);
        if (current.next == null){  // sonuncu elementirse
            current.prev.next = null;
            last = current.prev;
            current.prev = null;
        }else if (current.prev == null){ // ilk elementdirse
            current.next.prev = null;
            first = current.next;
            current.next = null;
        }else { // ortadan bir elementdirse
            current.prev.next  = current.next;
            current.next.prev = current.prev;
            current.prev = null;
            current.next = null;
        }
    }


    public Store<E> get(int index){
        int counter = 0;
        Store<E> current = first;
        while (counter != index && current != null){
            current = current.next;
            counter++;
        }
        if (counter == index){
            return current;
        }
        return null;
    }


    class Store<E> {

        E data;
        Store<E> next;
        Store<E> prev;

        public Store(Store<E> prev, E data, Store<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

}
