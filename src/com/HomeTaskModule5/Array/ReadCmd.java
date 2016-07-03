package com.HomeTaskModule5.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCmd {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int Read() throws IOException {
        System.out.println("Hello!Enter please quantity of numbers for array :");
        try {
            return Integer.parseInt(reader.readLine());

        } catch (NumberFormatException e) {
            System.out.println("You enter wrong value");
        }


        return 0;
    }
}

