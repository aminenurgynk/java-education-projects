package com.aminenurgynk.example;

public class Overloading {

    public static void main(String[] args) {
        draw();
        draw("Ali");

    }

    private static void draw() {
        System.out.println("-----------------");
    }

    private static void draw(String firstName) {
        System.out.println("-----------------:" + firstName);
    }


}