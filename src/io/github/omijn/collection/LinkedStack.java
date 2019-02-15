package io.github.omijn.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LinkedStack<Item> implements Iterable<Item> {
    private Node top;
    private int n;

    private class Node {
        private Item value;
        private Node next;

        private Node(Item val) {
            value = val;
        }
    }

    public LinkedStack() {
        top = null;
        n = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node oldTop = top;
        top = new Node(item);
        top.next = oldTop;
        n++;
    }

    public Item pop() {
        if (isEmpty())  throw new NoSuchElementException("Stack underflow");
        Item oldTop = top.value;
        top = top.next;
        n--;
        return oldTop;
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return top.value;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
        private Node current;

        private StackIterator() {
            current = top;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item currentItem = current.value;
            current = current.next;
            return currentItem;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String item = scanner.next();
            if (item.equals("q"))   break;
            if (!item.equals("-"))  stack.push(item);
            else if (!stack.isEmpty())
                System.out.println("Popped " + stack.pop());
        }

        for (String s: stack) {
            System.out.println(s);
        }
    }
}
