package com.aminenurgynk;

import java.util.Scanner;

public class MyApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int i = sc.nextInt();

        System.out.println("Result: " + i*5);


        System.out.print("Please enter your age : ");
        int vatingAge= sc.nextInt() , ageLimit=18;



        System.out.println(vatingAge >= ageLimit);


        // decision-making mechanism

        if (vatingAge >= ageLimit) {
            System.out.println("You can vote. ");
        } else {
            System.out.println("You can not vote!");
            System.out.println("You can use it " + (ageLimit - vatingAge) + " year later.");
        }

        System.out.print("Please enter a decimal number: ");
        float myValue = sc.nextFloat();

        System.out.println("Decimal result: " + myValue* 1.5);


    }

}