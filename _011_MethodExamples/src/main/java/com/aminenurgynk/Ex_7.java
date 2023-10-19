package com.aminenurgynk;

public class Ex_7 {
    private static void results(int... nums) {

        System.out.println("\n\nNumber of parameter " + nums.length);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }


    private static void results(String a, float[] b, int... nums) {

        System.out.println("\n\nNumber of parameter " + nums.length);

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }


    public static void main(String[] args) {
        results(10, 29);
        results(1, 4, 5, 3);
        results(1, 4, 5, 3, 2, 9);
        results(1, 4, 5, 3, 2, 9, 1, 4);
        results(1, 4, 5, 3, 2, 9, 1, 4, 5, 7, 0);
        results(1, 4, 5, 3, 2, 4, 5, 3, 2, 4, 5, 3, 2, 9, 1, 4, 5, 7, 0);

    }


}
