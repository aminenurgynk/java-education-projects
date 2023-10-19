package com.aminenurgynk;

public class Ex_1 {

    int a = 1; // 'Non-static' or 'instance'

    public static void main(String[] args) {
        int a = 2;
        System.out.println(a); // 2

        Ex_1 obj = new Ex_1();
        obj.sayHiii(); // 3

        System.out.println(obj.a); // 1 ---> Non-static

        /*
        Non-static (instance) variables are stored separately for each class instance (object).
        You can only access these variables through an instance of the class.
         */

    }

    private void sayHiii() {
        int a = 3;
        System.out.println(a); // 3
    }

}