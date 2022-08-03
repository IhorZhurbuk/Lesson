package com.dz;

import java.util.Arrays;
import java.util.Scanner;

public class AntiMage {
    public static void main(String[] args) {
        int size = 5 + (int) (Math.random() * 5);
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            int b = (int) (Math.random() * 101);
            arr[i] = b;
        }
        //System.out.println(Arrays.toString(arr));
        //--------------------------------------------
        int[] arrMonth = new int[12];
        for (int i = 0; i < arrMonth.length; i++) {
            switch (i) {
                case 1:
                    arrMonth[i] = 28;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:
                    arrMonth[i] = 30;
                    break;
                default:
                    arrMonth[i] = 31;
                    break;
            }

        }
        // System.out.println(Arrays.toString(arrMonth));
        //--------------------------------------------------
        int sizeArray = 10;
        byte[] arrByte = new byte[sizeArray];
        short[] arrShort = new short[sizeArray];
        int[] arrInt = new int[sizeArray];
        int value = (int) (Math.random() * Integer.MAX_VALUE);


        //      if (value > Short.MAX_VALUE) {
        //          arrInt[i] = value;
        //    } else if (value > Byte.MAX_VALUE) {
        //      arrShort[i] = (short) value;
        //} else {
        //  arrByte[i] = (byte) value;
        //}
        //   count++;

        //System.out.println(Arrays.toString(arrByte));
        //System.out.println(Arrays.toString(arrShort));
        //System.out.println(Arrays.toString(arrInt));
        //System.out.println(count);
        //-------------------------------------------------------

        char[] array = {'@', '_', '_', '_', '_', '_', '_', '_', '_', '_'};
        System.out.println("Lets play the game!");
        Scanner scanner = new Scanner(System.in);

        while (array[array.length - 1] != '@') {
            int position = getPosition(array);
            String command = scanner.next();

            if (command.equals("d")) {
                char tmp = array[position];
                array[position] = array[position + 1];
                array[position + 1] = tmp;
            } else if (command.equals("a")) {
                if (position != 0) {
                    char tmp = array[position];
                    array[position] = array[position - 1];
                    array[position - 1] = tmp;
                }
            } else {
                System.out.println("WRONG INPUT");
            }

            System.out.println(Arrays.toString(array));
        }
        System.out.println("Game over!");
    }

    public static int getPosition(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '@') {
                return i;
            }
        }
        return 0;
    }
}
