package io.github.omijn.algorithms.arrays;

import java.util.Arrays;

public class IncrementIntegerAsArray {
    public static int[] solution(int[] arr) {
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            if ((arr[i] += carry) == 10) {
                carry = 1;
                arr[i] = 0;
            }
            else carry = 0;
        }

        if (carry == 1) {
            int[] solution = new int[n + 1];
            solution[0] = 1;
            for (int i = 1; i < n; i++)
                solution[i] = arr[i - 1];
            return solution;
        }

        else return arr;

    }
}
