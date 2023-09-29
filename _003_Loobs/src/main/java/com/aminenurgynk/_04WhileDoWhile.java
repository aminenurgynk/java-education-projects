package com.aminenurgynk;

public class _04WhileDoWhile {

    public static void main(String[] args) {

        System.out.println("--------FOR----------");

        for (int i = 0;  i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------WHILE----------");

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
		/*
		System.out.println("---------infinty loob---------");

		int a = 0;
		while (true) {
			a++;
			System.out.println(a);
		}


		for (   ;   ;   ) {
		}
		*/

        System.out.println("---------WHILE---------");
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }

        System.out.println("--------DO WHILE-------");
        int b = 0;
        do {
            System.out.println(b);
            b++;
        } while (b < 0);




    }

}
