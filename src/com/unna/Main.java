package com.unna;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       /* Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("text.txt")));
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    String str = scanner.next();
                    try {
                        Integer.valueOf(str);
                    } catch (Exception e) {
                        System.out.println(str);
                    }
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } finally {
            scanner.close();
        }*/
        /*System.out.println(Double.valueOf("23.2"));
        System.out.println(Double.parseDouble("23,2"));*/
        Console console = System.console();
        if(console == null) {
            System.err.println("No found");
            System.exit(-1);
        }
    }
}
