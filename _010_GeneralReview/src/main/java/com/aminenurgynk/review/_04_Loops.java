package com.aminenurgynk.review;

import java.util.Scanner;

public class _04_Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        int i = 0;
        while (i < 10) {
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        int selection = 0;


        do {
            System.out.print("To exit, press the value 0 : ");
            selection = scanner.nextInt();
        } while (selection != 0);


    }
}