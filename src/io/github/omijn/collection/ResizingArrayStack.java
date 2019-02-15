package io.github.omijn.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] arr;     // array of items
    private int n;          // number of elements

    public ResizingArrayStack() {
        arr = (Item[]) new Object[2];
        n = 0;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int capacity) {
        // create new array, copy elements over
        Item[] newarr = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++)
            newarr[i] = arr[i];
        arr = newarr;

//        arr = Arrays.copyOf(arr, capacity);
    }

    public void push(Item item) {
        if (n == arr.length) resize(arr.length * 2);    // double stack capacity if stack is full
        arr[n++] = item;
    }

    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = arr[n - 1];
        arr[n - 1] = null;
        n--;
        if (n > 0 && n == arr.length / 4)   resize(arr.length / 2);
        return item;
    }

    public Item peek() {
        if (isEmpty())
            throw new NoSuchElementException("Stack underflow");    // the element being requested does not exist
        return arr[n - 1];
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private int i;

        public StackIterator() {
            i = n - 1;
        }

        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return arr[i--];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> stack = new ResizingArrayStack<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String item = scanner.next();
            if(item.equals("q"))    break;
            if (!item.equals("-"))
                stack.push(item);
            else if (!stack.isEmpty())
                System.out.println("Popped" + stack.pop());
        }

        for (String s : stack) {
            System.out.println(s);
        }
    }
}
