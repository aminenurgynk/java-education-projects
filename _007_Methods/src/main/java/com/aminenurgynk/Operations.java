package com.aminenurgynk;

public class Operations {

    public static void main(String[] args) {

        Operations obj = new Operations();

        int result = obj.sum(10, 5);
        System.out.println(result);
        obj.drawLine();

        result = obj.subtraction(100, 80);
        System.out.println(result);
        obj.drawLine();

        System.out.println(obj.multiplication(2, 3));
        obj.drawLine();

        System.out.println(obj.division(5, 2));


    }

    void drawLine() {
        System.out.println("-------------------");
    }

    int sum(int number1, int number2) {
        return number1 + number2;
    }

    int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    double division(int number1, int number2) {
        return (double) number1 / number2;
    }
}