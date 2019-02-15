package io.github.omijn.algorithms.sort;

public class Sorter {

    private int getArraySize(int[] array) {
        return array.length;
    }

    public void bubbleSort(int[] array) {
        int arraylen = getArraySize(array);
        for (int i = 0; i < arraylen; i++) {
            for (int j = i + 1; j < arraylen; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        int arraylen = getArraySize(array);
        for (int i = 0; i < arraylen; i++) {
            int min = array[i];
            int minpos = i;
            for (int j = i; j < arraylen; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minpos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minpos];
            array[minpos] = temp;
        }
    }

    public void insertionSort(int[] array) {
        int arraylen = getArraySize(array);
        for (int i = 1; i < arraylen; i++) {
            int j = i - 1;
            int cur = array[i];
            while (j >= 0 && array[j] > cur) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = cur;
        }
    }

    public void heapSort(int[] array) {

    }

    public void mergeSort(int[] array) {

    }

    public void quickSort(int[] array) {

    }

}
