package com.HomeTaskModule5.Array;

public class SortArrayInsert {
    public static int[] sortArrayInsert(int[] array, int arrayLenght) {

        int i, j, value;

        for (i = 1; i < arrayLenght; i++) {
            value = array[i];
            for (j = i - 1; j >= 0 && array[j] > value; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
        }
        return array;
    }
}
