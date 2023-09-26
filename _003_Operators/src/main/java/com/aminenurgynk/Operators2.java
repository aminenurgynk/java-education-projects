package com.aminenurgynk;

public class Operators2 {

    /*
     * Arithmetic operators
     * Relational operators
     * Bitwise operators
     * Logical operators
     * Assignment operators
     *
     */
    public static void main(String[] args) {

        //Arithmetic operators

        int number1 = 10, number2 = 3;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number1 % number2);

        // `++` Increment the variable by 1.
        System.out.println(number1++); // 10
        System.out.println(number1); // 11

        System.out.println(++number2); // 4
        System.out.println(number2); // 4

        // `--` Decrease the variable by 1.
        System.out.println(number1--); // 11
        System.out.println(number1); // 10

        System.out.println(--number2); // 3
        System.out.println(number2); // 3

        // Relational operators
        System.out.println(number2 == 3);
        System.out.println(number2 > number1);
        System.out.println(number2 >= 25);
        System.out.println(number2 < number1);
        System.out.println(number2 <= 25);


        // Bitwise operators
        System.out.println(number1 & number2);
        System.out.println(number1 | number2);
        System.out.println(number1 ^ number2);
        System.out.println(number1 >> number2);
        System.out.println(number1 << number2);


        // Logical operators

        boolean a = true;  // 1
        boolean b = false; // 0
        System.out.println(a && b); // 0
        System.out.println(a || b); // 1

        // Assignment operators
        number1 = 20;

        int result = 0;
        result = number1 + 5; // 20 + 5

        number1 = number1 + 5   ;
        System.out.println(number1);

        System.out.println(number1 += 5);




    }

}
