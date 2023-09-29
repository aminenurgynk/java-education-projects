package com.aminenurgynk;

public class _02IfElse {

    public static void main(String[] args) {

        if (1 < 25) {
            System.out.println("1. True. ДА предусмотрено.");
        } else {
            System.out.println("1. False. НЕТ не было.");
        }

        int a = 0;
        a = 100;
        if (a < 25) {
            System.out.println("2. True. ДА предусмотрено.");
        } else {
            System.out.println("2. False. НЕТ не было.");
        }

        System.out.println("--------------------------------");

        int x = 25;

        if (x == 10) {
            System.out.println("True");
        } else if (x == 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("--------------------------------");

        int daysOfWeek = 3;

        if (daysOfWeek == 1) {

            System.out.println("Monday");

        } else if (daysOfWeek == 2) {

            System.out.println("Tuesday");

        } else if (daysOfWeek == 3) {

            System.out.println("Wednesday");

        } else if (daysOfWeek == 4) {

            System.out.println("Thursday");

        } else if (daysOfWeek == 5) {

            System.out.println("Friday");

        } else if (daysOfWeek == 6) {

            System.out.println("Saturday");

        } else if (daysOfWeek == 7) {

            System.out.println("Sunday");

        } else {

            System.out.println("Enter a number between 1 to 7 ");


            System.out.println("-----------------------------");
/*
		15-(8-3)=
		15-5
		10
		*/
            System.out.println(15 - (8 - 3));

            int b = 1, c = 2, d = 3, e = 4;

            int result = ((b * 2 * e) + (c * 3)) / (c + d);

            if (result > 25) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }


        }

    }
}
