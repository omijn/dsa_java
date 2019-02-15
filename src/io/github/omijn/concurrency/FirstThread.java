package io.github.omijn.concurrency;

import java.util.Comparator;

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run");
    }
}

public class FirstThread {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

    }
}
