package com.aminenurgynk;

public class Ex_3 {

    public Ex_3() {
        System.out.println("Constructor Method");
    }


    public int sayHiii() {
        System.out.println("Regular Method");
        return 25;
    }

    public static void main(String[] args) {

        Ex_3 obj = new Ex_3();
        obj.sayHiii();

        System.out.println("Main Method");

    }


}