package com.aminenurgynk;
    public class _01If {
    public static void main(String[] args) {

        if (  1 > 0  ) {
            System.out.println("1. True");
        }

/*
		if (  1 > 25  ) {
			System.out.println("2. True");
		}
*/

        int a = 3;

        if (a > 25) {
            System.out.println("3. True");
        }


        int x, y, z;
        x = 10;
        y = 15;
        z = 25;

        //     25  >  -10
        if ( (x+y) > (y-z) ) {
            System.out.println("4. True");
        }

    }

}