package com.company.collections;

public class DoublyLinkedList<E> {

    private Node<E> first;
    private Node<E> last;

    private int size = 0;

    public void add(E e) {
        Node<E> lastNode = last;
        Node<E> newNode = new Node<>(lastNode, e, null);
        if (first == null) {
            first = newNode;
        }else {
            lastNode.next = newNode;
        }
        last = newNode;
        size++;
    }

    public void remove(int index){
        Node<E> current = get(index);
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


    public Node<E> get(int index){
        int counter = 0;
        Node<E> current = first;
        while (counter != index && current != null){
            current = current.next;
            counter++;
        }
        if (counter == index){
            return current;
        }
        return null;
    }


    class Node<E> {

        E data;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

}
