package com.aminenurgynk;

public class HiiArray {

    public static void main(String args) {

        int number1 = 10;
        int number2 = 14;
        int number3 = 15;
        int number4 = 22;

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);


// Array
//	int number[] = null; // NullPointerException
//	int number[] = new int[4];
/*
int number[];
number = new int[4];
*/
/*
int a;
a = 10;
*/

        int[] number = new int[4];

        number[0] = 10;
        number[1] = 14;
        number[2] = 15;
        number[3] = 22;

        System.out.println(number[0] + " " + number[1] + " " + number[2] + " " + number[3]);
/*
number[55] = 33;
System.out.println(number[55]); // ArrayIndexOutOfBoundsException
*/

        for (int index = 0; index <= number.length; index++) {
            System.out.println(number[index]);
        }

    }

}