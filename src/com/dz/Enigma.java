package com.dz;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Enigma {
    static final int size = 3;

    public static void main(String[] args) {
        String[][] data = new String[size][size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elements:");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = scanner.nextLine();
            }
        }
        while (true) {
            System.out.println("Search");
            String str = scanner.nextLine();

            if (str.equals("q")) {
                break;
            }
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data.length; j++) {
                    if (data[i][j].toLowerCase().contains(str.toLowerCase())) {
                        for (String[] datum : data) {
                            System.out.print(datum[j] + " ");
                        }
                        System.out.println();

                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(data));
        System.out.printf("%tB", new Date());
    }

}

