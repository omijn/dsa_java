package io.github.omijn.algorithms.search;

import java.util.Arrays;

public class BinarySearch {
    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
        Arrays.sort(this.array);
    }

    public int search(int element) {
        int low = 0, high = this.array.length - 1, mid;

        while(low <= high) {
            mid = (low + high) / 2;

            if (element == this.array[mid]) {
                return mid;
            }

            else if (element < this.array[mid]) {
                high = mid - 1;
            }

            else if (element > this.array[mid]) {
                low = mid + 1;
            }
        }

        return -1;
    }
}
