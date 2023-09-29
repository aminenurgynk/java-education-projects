package com.aminenurgynk;

public class DataType {  // Scope 1

    static int i = 10;
    int b = 1;
    int j = 2;
    int k = 3;

    public static void main(String[] args) { // Scope 2
        boolean status = false;

        byte age = 127;
        short numberOfMember = 32767;

        char course = 'A';
        int population = 2_147_483_647;

        long sumOfBankAccount1 = 100l;
        long sumOfBankAccount2 = 100L;

        float pi1 = (float) 3.14;
        float pi2 = 3.14f;
        float pi3 = 3.14F;

        double myBankAccount1 = 1;
        double myBankAccount2 = 1d;
        double myBankAccount3 = 1_000_000.52D;


        String name = "Mehmet Caner";
        String surname = "Öksöz";
        System.out.println(name + " " + surname);

        System.out.println(i); // 10

        DataType obj = new DataType();

        System.out.println(obj.b); // 1
        obj.b = 40;
        System.out.println(obj.b); // 40

        obj.j = 50;
        System.out.println(obj.j);

        obj.k = 60;
        System.out.println(obj.k);

        DataType obj2 = new DataType();
        System.out.println(obj2.b);
    }

}
