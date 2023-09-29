package com.aminenurgynk;

public class _05Break {

    public static void main(String[] args) {

        System.out.println("-----FOR BREAK---------");

        for (int i = 0; i < 1_000_000; i++) {

            // find 20 and out
            if (i == 20) { // bul
                System.out.println("here is 20");
                break; // out
            } else {
                System.out.println("NOT:  " + i);
            }
        }

        System.out.println("-----WHILE BREAK---------");

        int i = 0;
        while (i < 25) {
            // System.out.println(i);

            if (i == 20) {
                System.out.println("here is 20");
                break;
            } else {
                System.out.println("NOT " + i);
            }
            i++;

        }

    }

}
