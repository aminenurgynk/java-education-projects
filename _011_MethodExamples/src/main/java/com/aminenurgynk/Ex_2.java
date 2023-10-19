package com.aminenurgynk;

import java.util.Scanner;

public class Ex_2 {

    static int num = 5;
    static String name = new String("Aminenur");
    static Scanner scanner = new Scanner(System.in);


    private static void getData() {
        System.out.print("Enter the number : ");
        num = scanner.nextInt(); // 10

        System.out.print("\nEnter the name : ");
        name = scanner.next(); // Ahmet
    }

    private static void showIt() {
        System.out.println("\nMethod of Show It() ----->  Name: " + name + "  NO: " + num);
    }


    public static void main(String[] args) {

        System.out.println("\nbefore methods ----->  Name: " + name + "  NO: " + num);

        getData();
        showIt();

        System.out.println("\nafter methods -----> Name: " + name + "  NO: " + num);

    }


}