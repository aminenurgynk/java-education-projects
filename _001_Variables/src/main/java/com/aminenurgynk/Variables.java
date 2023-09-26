package com.aminenurgynk;


public class Variables {

    public static void main(String[] args) {
        //Primitive Data Type

/*      `Integer` is a data type in Java used to represent whole numbers.
        It is a wrapper class for the primitive data type `int`*/
        int myInt = 10;

/*      `Byte` --> primitive data type `byte`.
        It is used to represent small integer values.(min value:-128, max value:128)*/
        byte myByte = 10;

/*      `Short` --> primitive data type `short`.
        It is used to represent small integer values.(min value:-32768, max value:32768)*/
        short myShort = 10;

        // Byte and short data types represent small integer values,
        // but while byte uses less memory,
        // short has a wider range of values

/*      `Long` --> primitive data type `long`.
        It is used to represent long integer values.*/
        long myLong = 10;

/*      `Float` --> primitive data type `float`.
        It is used to represent single-precision floating-point numbers.*/
        float myFloat = 10;

/*      `Double` --> primitive data type `double`.
        It is used to represent double-precision floating-point numbers.*/
        double myDouble = 10;

/*      `Boolean` is a data type in Java used to represent Boolean values, which can be either true or false.
         --> primitive data type `boolean`.*/
        boolean myBoolean = false;

/*      `Char` is a data type in Java used to represent a single character.
        It can store any character, including letters, digits, and special symbols.*/
        char myChar = 'A';

        System.out.println("int type : " + myInt);
        System.out.println("byte type : " + myByte);
        System.out.println("short type : " + myShort);
        System.out.println("long type : " + myLong);
        System.out.println("float type : " + myFloat);
        System.out.println("double type : " + myDouble);
        System.out.println("boolean type : " + myBoolean);
        System.out.println("char type : " + myChar);

        //Wrapper Class

        Integer myInt2 = 10;
        Byte myByte2 = 10;
        Short myShort2 = 10;
        Long myLong2 =  10l;
        Float myFloat2 = 10f;
        Double myDouble2 = 10d;
        Boolean myBoolean2 = false;
        Character myChar2 = 'A';


        System.out.println("Integer type : " + myInt2);
        System.out.println("Byte type : " + myByte2);
        System.out.println("Short type : " + myShort2);
        System.out.println("Long type : " + myLong2);
        System.out.println("Float type : " + myFloat2);
        System.out.println("Double type : " + myDouble2);
        System.out.println("Boolean type : " + myBoolean2);
        System.out.println("Character type : " + myChar2);


        // MIN-MAX values of type

        System.out.println("Integer type min  : " + myInt2.MIN_VALUE);
        System.out.println("Integer type max  : " + myInt2.MAX_VALUE);

        System.out.println("Byte type min     : " + myByte2.MIN_VALUE);
        System.out.println("Byte type max     : " + myByte2.MAX_VALUE);

        System.out.println("Short type min    : " + myShort2.MIN_VALUE);
        System.out.println("Short type max    : " + myShort2.MAX_VALUE);

        System.out.println("Long type min     : " + myLong2.MIN_VALUE);
        System.out.println("Long type max     : " + myLong2.MAX_VALUE);

        System.out.println("Float type min    : " + myFloat2.MIN_VALUE);
        System.out.println("Float type max    : " + myFloat2.MAX_VALUE);

        System.out.println("Double type min   : " + myDouble2.MIN_VALUE);
        System.out.println("Double type max   : " + myDouble2.MAX_VALUE);

        System.out.println("Boolean type false: " + myBoolean2.FALSE);
        System.out.println("Boolean type true : " + myBoolean2.TRUE);

        System.out.println("Character type min: " + myChar2.MIN_VALUE);
        System.out.println("Character type max: " + myChar2.MIN_VALUE);




    }
}
