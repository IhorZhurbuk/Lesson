package com.dz;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i, count = 5;
        Random random = new Random();
        int answer = random.nextInt(101);
        System.out.println("Guess a number between 0 and 100: ");
        boolean isWin = false;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < count; i++) {
            int number = scanner.nextInt();
            do {
                if (scanner.hasNextInt()) {
                    System.out.println("WRONG!");
                    scanner.next();
                    break;

                }

            } while (true);

            if (number == answer) {
                System.out.println("You win!");
                break;
            } else if (number > answer && i != count - 1) {
                System.out.println("So close,but the number is less");

            } else if (number < answer && i != count - 1) {
                System.out.println("So close,but the number is bigger");

            }
        }
        scanner.close();
        if (i == count) {
            System.out.println("You lost the number was " + answer);
        }

    }
}

