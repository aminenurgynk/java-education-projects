package com.aminenurgynk;

public class Ex_5 {

    int num; // 0
    String name; // null


    //Overlonameng
    public Ex_5() {
        System.out.println("Constructor");
        this.num = 10;
        this.name = "Aminenur Goynuk";
    }

    public Ex_5(String name, int num) {
        System.out.println("Constructor");
        this.num = num;
        this.name = name;
    }

    public Ex_5(int num, String name) {
        System.out.println("Constructor");
        this.num = num;
        this.name = name;
    }

    public Ex_5(String name) {
        System.out.println("Constructor");
        this.name = name;
    }


    public static void main(String[] args) {

        Ex_5 obj1 = new Ex_5();
        System.out.println(obj1.num + " " + obj1.name);

        Ex_5 obj2 = new Ex_5("Burak Delice", 88);
        System.out.println(obj2.num + " " + obj2.name);

        Ex_5 obj3 = new Ex_5(92, "Ünal Gani Berk");
        System.out.println(obj3.num + " " + obj3.name);

        Ex_5 obj4 = new Ex_5("Gizem Kuşçuoğlu");
        System.out.println(obj4.num + " " + obj4.name);


    }
}