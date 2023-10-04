package com.aminenurgynk.pr2;

import com.aminenurgynk.pr1.A;

public class B {
    public void showB() {
        System.out.println("I am the public display method in class B.");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.showA();
    }
}
