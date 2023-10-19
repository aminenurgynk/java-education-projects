package com.aminenurgynk;

public class Ex_9 {

    public Ex_9(String fullname, int age, Boolean haveTool) {
        System.out.println("Constructor Method.");
    }

    public Ex_9(String fullname, int age) {
        System.out.println("Constructor Method.");
    }

    public Ex_9(String fullname, int height, int weight) {
        System.out.println("Constructor Method.");
    }

    public Ex_9(String fullname) {
        System.out.println("Constructor Method.");
    }


    private static String write() {
        System.out.println("Regular Method.");
        return "Hello";
    }

    private static String write(int quantity) {
        System.out.println("Regular Method.");
        return "Hello";
    }

    private static String write(int salary, int price) {
        System.out.println("BJK");
        return "Hello";
    }

    private static double write(int salary, Integer price) {
        System.out.println("BJK");
        return 1.0;
    }

    private static String write(short price, int salary) {
        System.out.println("GS");
        return "Hello";
    }


    private static boolean write(int salary, short price) {
        System.out.println("FB.");
        return true;
    }

    public static void main(String[] args) {


        System.out.println("Main Method.");
        String answer = write();
        System.out.println(answer);

        write();
        write(1, 1);
        write(1, (short) 1);

        Ex_9 nesne1 = new Ex_9("Amine");

        Ex_9 nesne2 = new Ex_9("Amine");

        short a = 32756;
        short b = 10000;
        int c = a + b;

        byte a2 = 1;
        byte b2 = 1;
        int c2 = a2 + b2;

        int c3 = a + a2;


    }


}