package com.aminenurgynk;


public class Loops {

    public static void main(String[] args) {

/*
			int i = 0;
			System.out.println(i);

			i = i + 1;
			System.out.println(i);

			i += 1;
			System.out.println(i);

			i++;
			System.out.println(i);

		 */

        // Initialization-Condition-Increment/Decrement
        for (int i = 0;   i < 10;  i++) { //Scope
            System.out.println(i);
        }


        for (int i = 0;    i < 10;     i += 2) {
            System.out.println(i);
        }


        for (int i = 0;    i < 10;    i = i + 2) {
            System.out.println(i);
        }







    }
}
