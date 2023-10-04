package com.aminenurgynk.staticMethods;

public class MyApp {

    //Overloading
    public void sayHii() {
        System.out.println("Hello");
    }

    public void sayHii(String firstName) {
        System.out.println("Hello" + firstName);
    }

    public void sayHii(String firstName, String lastName) {
        System.out.println("Hello" + firstName + "" + lastName);
    }


    public static void main(String[] args) {


        MyApp obj = new MyApp();
        obj.sayHii();
        obj.sayHii("Ahmet");
        obj.sayHii("Ahmet", "Akkoyun");


    }


}