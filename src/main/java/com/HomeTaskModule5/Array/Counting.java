package com.HomeTaskModule5.Array;

public class Counting {
    public static void calculateMaxValue(int[] arrays) {

        for (int i = 0; i < arrays.length - 1; i++) {

            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] < arrays[j + 1]) {
                    int tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;

                }
            }
        }
        System.out.println("MAX Value is: " + arrays[0]);
    }

    public static void calculateMinValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int mini = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    mini = j;
                }
            }
            if (i != mini) {
                int tmp = array[i];
                array[i] = array[mini];
                array[mini] = tmp;
            }
        }
        System.out.println("MIN value is: " + array[0]);
    }
}



