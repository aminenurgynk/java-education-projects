package com.aminenurgynk;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //	int [] myNumbers = new int [3];
        //	int [] myNumbers = {8, 44, 55};


        int[][] myNumbers = new int[3][5];

        myNumbers[0][0] = 10;
        myNumbers[0][1] = 15;
        myNumbers[0][2] = 20;
        myNumbers[0][3] = 8;
        myNumbers[0][4] = 9;

        //  [0][]     [1][]           [2][]
        int[][] myArray2 = {{10, 20, 30}, {10, 12, 40}, {50, 70, 90}};

        for (int i = 0; i < myArray2.length; i++) {

            for (int j = 0; j < myArray2.length; j++) {

                System.out.print(myArray2[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------------------");


        int[][] myArray3 = {
                {10, 20, 30, 11},
                {80, 12, 40, 65},
                {50, 70, 90, 77}
        };

        for (int i = 0; i < myArray3.length; i++) {

            for (int j = 0; j < myArray3[i].length; j++) {

                System.out.print(myArray3[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------------------");


        Integer[][] myArray4 = {
                {10, 20, 30, 11, null},
                {},
                {80, 12, 40, 65, 66},
                {50, 70, 90}
        };

        System.out.println(myArray4[3][4]);


        System.out.println("---------------------");


        for (int i = 0; i < myArray4.length; i++) {

            for (int j = 0; j < myArray4[i].length; j++) {

                System.out.print(myArray4[i][j] + " ");

            }
            System.out.println();
        }


    }

}