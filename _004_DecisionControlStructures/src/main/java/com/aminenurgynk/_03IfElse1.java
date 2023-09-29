package com.aminenurgynk;

public class _03IfElse1 {

    public static void main(String[] args) {

        boolean medicalReport = true;
        int age = 25;

        if(medicalReport == true  && age > 18 ) {
            System.out.println("You are eligible to obtain a driver's license.");
        } else {
            System.out.println("You are not eligible to obtain a driver's license.");
        }


        System.out.println("-------------------------------------");

        medicalReport = false;
        age = 25;

        if(medicalReport == true  && age > 18 ) {
            System.out.println("You are eligible to obtain a driver's license.");
        } else {
            System.out.println("You are not eligible to obtain a driver's license.");
        }

        System.out.println("-------------------------------------");

        medicalReport = false;
        age = 15;

        if(medicalReport == true  && age > 18 ) {
            System.out.println("You are eligible to obtain a driver's license.");
        } else {


            if (medicalReport == false) {
                System.out.println("The medical report is invalid.");
            }


            if (age < 18) {
                System.out.println("You are not bigger than 18 yet.");
            }


            System.out.println("You are not eligible to obtain a driver's license.");

        }


    }

}