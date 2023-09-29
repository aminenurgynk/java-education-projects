package com.aminenurgynk;

import java.util.Random;

public class MyArray {

    public static void main(String[] args) {

        int[][] myArr = new int[3][3];

        myArr[0][0] = 123;
        myArr[2][1] = 33;

        // ArrayIndexOutOfBoundsException
        // myArr [4][4]=55;

        System.out.println("-- 2D Array ---------------------");

        int row = 14;
        int column = 5;

        int[][] yourArr = new int[row][column];

        Random randomNumber = new Random();

        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < column; j++) { // column
                yourArr[i][j] = randomNumber.nextInt(100);
            }
        }

        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < column; j++) { // column
                System.out.print(yourArr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-- 3D Array ---------------------");

        int[][][] yourArr3d = new int[6][4][3];
        /*
         * yourArr3d [0][0][0] = 88; yourArr3d [0][0][1] = 55; yourArr3d [0][0][2] = 77;
         */
        for (int i = 0; i < 6; i++) { // TABLE - tablo
            for (int j = 0; j < 4; j++) { // ROW - row
                for (int k = 0; k < 3; k++) { // COLUMN
                    yourArr3d[i][j][k] = randomNumber.nextInt(2000);
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("\nNo : " + (i + 1));

            for (int j = 0; j < 4; j++) {

                for (int k = 0; k < 3; k++) {
                    System.out.print(yourArr3d[i][j][k] + "\t");
                }

                System.out.println();
            }
        }

        System.out.println("-----------------------");

        for (int i = 0; i < yourArr3d.length; i++) {
            System.out.println("\nNo : " + (i + 1));

            for (int j = 0; j < yourArr3d[i].length; j++) {

                for (int k = 0; k < yourArr3d[i][j].length; k++) {
                    System.out.print(yourArr3d[i][j][k] + "\t");
                }

                System.out.println();
            }
        }

    }

}
