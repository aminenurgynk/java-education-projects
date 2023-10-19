package com.aminenurgynk;

public class AppMain { // SCOPE - BODY

    static int b = 25; // `static`

    public static void main(String[] args) {
        // 35
        int a = 10 + b; // 'static' --> They can be accessed without creating any class instances (objects)
        //35      25
        System.out.println(a + " " + b);
    }

}