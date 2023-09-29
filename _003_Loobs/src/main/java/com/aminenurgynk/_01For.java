package com.aminenurgynk;

public class _01For {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------");

        for (int number = 0; number < 10; number++) {
            System.out.println(number);
        }

        System.out.println("------------------------");

        for (int number = 0; number < 10; number++) { // Scope

            if (number == 3) {
                System.out.println("\there is number `3` " + number);
            }

            System.out.println(number);

        }

        System.out.println("------------------------");

        for (int i = 1; i < 5; i++) {
            System.out.println("\ni: " + i);

            for (int j = 1; j <= 7; j++) {
                System.out.println("\tj: " + j);

                //System.out.println("i: " + i   +  "\t" + "j: " + j );

            }

        }

    }

}