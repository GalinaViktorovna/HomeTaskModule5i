package com.HomeTaskModule5.Array;

public class MinValue {
    public static void minValue(int[] array) {
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
        System.out.println("According to Selection sort MIN value is: " + array[0]);
    }
}
