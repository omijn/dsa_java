package io.github.omijn.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    private Sorter sorter;

    public SorterTest() {
        this.sorter = new Sorter();
    }

    @Test
    void bubbleSort() {
        int[] arr = new int[]{9, 8, 3, 2, 1, 0, 8, -4, 5};
        this.sorter.bubbleSort(arr);
        assertArrayEquals(new int[]{-4, 0, 1, 2, 3, 5, 8, 8, 9}, arr);
    }

    @Test
    void selectionSort() {
        int[] arr = new int[]{9, 8, 3, 2, 1, 0, -4, 8, 5};
        this.sorter.selectionSort(arr);
        assertArrayEquals(new int[]{-4, 0, 1, 2, 3, 5, 8, 8, 9}, arr);
    }

    @Test
    void insertionSort() {
        int[] arr = new int[]{9, 8, 3, 2, 1, 0, -4, 8, 5};
        this.sorter.insertionSort(arr);
        assertArrayEquals(new int[]{-4, 0, 1, 2, 3, 5, 8, 8, 9}, arr);
    }
}