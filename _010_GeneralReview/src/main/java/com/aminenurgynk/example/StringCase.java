package com.aminenurgynk.example;

public class StringCase {
    public static void main(String[] args) {

        String case1 = "Hii";
        int number1 = 10;

        System.out.println(2 + number1 + case1); // 12Hii
        System.out.println(case1 + 2 + case1); // Hii210
        System.out.println(case1 + (2 + number1)); // Hii12


    }
}