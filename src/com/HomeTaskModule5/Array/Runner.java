package com.HomeTaskModule5.Array;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Array arrayObject = new Array();
        arrayObject.addToArray(arrayObject.createArray(arrayObject, ReadCmd.Read()));
        arrayObject.printArray(arrayObject.getArray());
        MaxValue.maxValue(arrayObject.getArray());
        MinValue.minValue(arrayObject.getArray());
        SortArrayInsert.sortArrayInsert(arrayObject.getArray(),arrayObject.getLenghtArray());
        arrayObject.printArray(arrayObject.getArray());



    }

}
