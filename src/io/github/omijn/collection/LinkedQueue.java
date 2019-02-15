package io.github.omijn.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<Item> implements Iterable<Item> {
    private int n;
    private Node eEnd;
    private Node dEnd;

    private class Node {
        private Item value;
        private Node next;

        private Node(Item val) {
            value = val;
        }
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return dEnd == null;
    }

    public void enqueue(Item item) {
        Node oldEEnd = eEnd;
        eEnd = new Node(item);
        if (isEmpty())  dEnd = eEnd;
        else oldEEnd.next = eEnd;
        n++;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException();
        Item item = dEnd.value;
        dEnd = dEnd.next;
        n--;
        if (isEmpty())  eEnd = null;
        return item;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException();
        return dEnd.value;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        private Node current = dEnd;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.value;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }
}
