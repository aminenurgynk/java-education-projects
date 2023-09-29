package com.aminenurgynk;

public class MyTypeCasting {


    public static void main(String[] args) {


        int intAge = 18; // 32 bit

        double doubleAge = intAge;  // 64 bit
        System.out.println(intAge);
        System.out.println(doubleAge);


        float floatAge = intAge; // 32 bit
        System.out.println(intAge);
        System.out.println(floatAge);

        byte byteAge = (byte) intAge; // 8 bit
        System.out.println(intAge);
        System.out.println(byteAge);


        long longAge = intAge;  // 64 bit
        System.out.println(intAge);
        System.out.println(longAge);

        System.out.println("-----------------------");

        int a = 2_147_483_647; // 32 bit
        int b = 1;
        int c = a + b;
        System.out.println(c);

        System.out.println("-----------------------");
        byte x = 127; // 8 bit
        byte y = 127; // 8 bit
//byte z = (byte) (x + y);
        float z = x + y; // 32 bit
//int z =  x + y;
        System.out.println(z);

        System.out.println("-----------------------");
        short x1 = 1; // 16 bit
        short y1 = 2; // 16 bit
        short z1 = (short) (x1 + y1); // 16 bit
//int z1 = x1 + y1; // 32 bit
        System.out.println(z1);

        System.out.println("-----------------------");
        int myIntVal = 2_147_483_647; // 32 bit
        short myShortVal = 1; // 16 bit
        int myResult = myIntVal + myShortVal;
        System.out.println(myResult);

        System.out.println("-----------------------");
        byte myByteVal1 = 127; // 8 bit
        short myShortVal1 = 32767; // 16 bit
        int result = myByteVal1 + myShortVal1;
        System.out.println(result);

        System.out.println("-----------------------");
        float a1 = 1.123456789f; // 32 bit
        float b1 = 1.1F;
        float c1 = a1 + b1;
        System.out.println(c1);


    }

}
