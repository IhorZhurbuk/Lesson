package com.dz;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number");
        int number = scanner.nextInt();
        int evenCount = 0;
        int count = 0;

        while (number > 0) {
            if ((number % 10) % 2 == 0)
                evenCount++;

            number = number / 10;
            count++;
        }
        System.out.println("Even count : " + evenCount);
        System.out.println("Count : " + count);

    }
}
