package com.HomeTaskModule5.Array;

public class MaxValue {
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
        System.out.println("MAX Value is: " + arrays[0]);
    }
}



