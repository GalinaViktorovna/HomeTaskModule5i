package com.HomeTaskModule5.Array;

import java.io.IOException;

public class Array {
    private int[] array;
    private int lenghtArray;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLenghtArray() {
        return lenghtArray;
    }

    public void setLenghtArray(int lenghtArray) {
        this.lenghtArray = lenghtArray;
    }

    public int[] createArray(Array arrayObj, int lenghtArray) {
        arrayObj.setLenghtArray(lenghtArray);
        arrayObj.array = new int[lenghtArray];
        return arrayObj.array;


    }

    public int[] addToArray(int[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " number :");
            array[i] = Integer.parseInt(ReadCmd.reader.readLine());

        }
        return array;
    }

    public void printArray(int[] arrayObj) {
        System.out.print("It's your array :  ");
        for (int i :arrayObj) {
            System.out.print(arrayObj[i] + " ");
        }
        System.out.println();
    }


}
