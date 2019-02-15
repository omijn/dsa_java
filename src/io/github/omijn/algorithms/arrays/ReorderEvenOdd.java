package io.github.omijn.algorithms.arrays;

import java.util.Arrays;

public class ReorderEvenOdd {
    public static void solution(int[] arr) {

        int firstOddPosition = -1;

        for(int i = 0; i < arr.length; i++) {
            if (firstOddPosition == -1 && arr[i] % 2 == 1) {
                firstOddPosition = i;
            }
            else if (firstOddPosition != -1 && arr[i] % 2 == 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[firstOddPosition];
                arr[firstOddPosition] = temp;
                firstOddPosition = -1;
                i = firstOddPosition;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void anotherSolution(int[] arr) {
        int oddPointer = 0;
        int evenPointer = arr.length - 1;
        while (oddPointer < evenPointer) {
            while (arr[oddPointer] % 2 == 0)
                oddPointer++;
            while (arr[evenPointer] % 2 == 1)
                evenPointer--;

            if (oddPointer >= evenPointer)
                break;

            int temp = arr[oddPointer];
            arr[oddPointer] = arr[evenPointer];
            arr[evenPointer] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
