package com.melo.sortalgorithms;

/**
 *
 **/

public class ShellSort {

    public static void main(String[] args) {

    }

    public static int[] shellSort(int[] arr) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        // find the gap value
        // assign new element
        // initialize traversal
        // initialize gapTraversal

        return arr;
    }

    public static boolean isBigger(int a, int b) {
        return a > b;
    }

    public static int[] swap(int[] arr, int index1, int index2) {
        int temp =  arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return arr;
    }

    public static int[] insertionSort() {
        int[] intArray2 = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex2 = 1; firstUnsortedIndex2 < intArray2.length; firstUnsortedIndex2++) {
            int newElement2 = intArray2[firstUnsortedIndex2];
            int i;
            for (i = firstUnsortedIndex2; i > 0 && intArray2[i - 1] > newElement2; i--) {
                intArray2[i] = intArray2[i - 1];
            }
            intArray2[i] = newElement2;
        }

        return intArray2;
    }
}
