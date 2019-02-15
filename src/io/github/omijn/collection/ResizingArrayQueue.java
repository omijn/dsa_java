package io.github.omijn.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayQueue<Item> implements Iterable<Item> {
    private Item[] arr;     // items in array
    private int n;          // size of array
    private int dEnd;       // dequeue end
    private int eEnd;       // enqueue end

    public ResizingArrayQueue() {
        arr = (Item[]) new Object[2];
        n = 0;
        dEnd = 0;
        eEnd = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private void resize(int capacity) {
        Item[] newArr = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++)
            newArr[i] = arr[(dEnd + i) % arr.length];
        arr = newArr;
        dEnd = 0;
        eEnd = n;
    }

    public void enqueue(Item item) {
        if (n == arr.length)    resize(2 * arr.length);
        arr[eEnd++] = item;
        if (eEnd == arr.length) eEnd = 0;
        n++;
    }

    public Item dequeue() {
        if (isEmpty())  throw new NoSuchElementException();
        Item removedItem = arr[dEnd];
        arr[dEnd] = null;
        dEnd++;
        n--;
        if (dEnd == arr.length) dEnd = 0;
        if (n < arr.length / 4) resize(arr.length / 2);
        return removedItem;
    }

    public Item peek() {
        if (isEmpty())  throw new NoSuchElementException();
        return arr[dEnd];
    }


    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }



    private class QueueIterator implements Iterator<Item> {
        private int i;

        @Override
        public boolean hasNext() {
            return i < n;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = arr[(dEnd + i) % arr.length];
            i++;
            return item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
