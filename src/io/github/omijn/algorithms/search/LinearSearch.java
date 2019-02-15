package io.github.omijn.algorithms.search;

public class LinearSearch {
    private int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int search(int element) {
        for (int i = 0; i < this.array.length; i++) {
            if (element == array[i])
                return i;
        }
        return -1;
    }
}
