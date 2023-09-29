package com.aminenurgynk;

import java.util.Scanner;

public class ArraySize {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int size, sum = 0;

        System.out.print("Enter the size of array : ");
        size = read.nextInt(); // 5

        short myArray[] = new short[size];

        System.out.println("Size of array is " + size);

        System.out.println("--------------------------");

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = read.nextShort();
        }

        System.out.println("--------------------------");

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
            System.out.println(myArray[i]);
        }

        //( myArray[i] == item )
        for (short item : myArray) {
            sum = sum + item;
        }

        System.out.println("Sum : " + sum);
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
Index 8 out of bounds for length 4
*/

    }

}
