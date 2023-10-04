package com.aminenurgynk.example;

public class Stars {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        drawLine();


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        drawLine();


        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        drawLine();

        /*


         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *



         */

        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * *");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    private static void drawLine() {
        System.out.println("------------------------------");
    }
}