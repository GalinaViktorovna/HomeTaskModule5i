package com.HomeTaskModule5.Array;

public class MaxValue {


    public static void Sort(int[] array) {
        int first = 0;
        int last = array.length - 1;
        QuickSorting(array, first, last);
        System.out.println("According to quickSorting MAX Value is: " + array[array.length-1]);
    }

    private static void Swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void QuickSorting(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int mid = (i + j) / 2;
        while (i < j) {
            while ((i < mid) && (array[i] <= array[mid])) i++;
            while ((j > mid) && (array[mid] <= array[j])) j--;
            if (i < j) {
                Swap(array, i, j);
                if (i == mid)
                    mid = j;
                else if (j == mid)
                    mid = i;
            }
        }
        QuickSorting(array, start, mid);
        QuickSorting(array, mid + 1, end);
    }

    public static void maxValue(int[] arrays) {

        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    int tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;

                }
            }
        }
        System.out.println("According to Bubble sort MAX Value is: " + arrays[0]);
    }
}



