package com.aminenurgynk;

public class MyApp { //scope

    static int number; // 0

    public MyApp() {
        number = 25; // 25
        System.out.println("First Constructor: " + number);
    }

    public static void main(String[] args) { //scope
        // int sayi = 12;

        // 0     12    25    run time exception!
        System.out.println("main method first issue: "+ number);


        MyApp myObj = new MyApp();


        System.out.println("main method second issue: "+ number);

    }

}
