package com.aminenurgynk.example;

public class CallingMethods {

    public static void main(String[] args) {
        kulaklik();
    }

    private static void kulaklik() {
        System.out.println("KULAKLIK");
        sagKulaklik();
        solKulaklik();

    }

    private static void solKulaklik() {
        System.out.println("solKulaklik");
    }

    private static void sagKulaklik() {
        System.out.println("sagKulaklik");
    }


}