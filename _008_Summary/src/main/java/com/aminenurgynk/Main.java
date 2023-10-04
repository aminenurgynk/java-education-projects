package com.aminenurgynk;

import java.time.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("------------------------");

        String str1 = "abcabcabcabcabc";
        System.out.println(str1.startsWith("t")); // false
        System.out.println(str1.endsWith("c"));  // true

        System.out.println(str1.contains("b"));


        String personnelName = " Mehmet Caner ";
        System.out.println(personnelName);
        System.out.println(personnelName.trim());

        var name = "Ahmet Akkoyun";
        System.out.println(name.toUpperCase());

        var age = 25;
        System.out.println(age);


        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());


        var piNumber = 3.1434568888;
        System.out.format("%.2f", piNumber);

        System.out.println("----------------------");

        var x = "Amine";
        var y = "Amine";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("----------------------");

        String z = "Amine";
        System.out.println(x == z);
        System.out.println(x.equals(z));

        System.out.println("----------------------");

        String n = new String("Amine");
        System.out.println(x == n);
        System.out.println(x.equals(n));

        System.out.println("----------------------");

        System.out.println(" " + 1 + 2);     //    12
        System.out.println(1 + " " + 2 + 3); // 1  23
        System.out.println(1 + 2 + " " + 8); // 3   8

        System.out.println(" " + (1 + 2));     //   3
        System.out.println(1 + " " + (2 + 3));  // 1 5
        System.out.println((1 + 2) + " " + 8);   // 3 8

        System.out.println("----------------------");
        //   0         1        2       3
        String[] animal = {"Camel", "Monkey", "Lion", "Tiger"};
        System.out.println(animal.length);

        System.out.println(animal[0]); // Camel
        animal[0] = "Cat";
        System.out.println(animal[0]); // Cat

        System.out.println("----------------------");

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
        }
        System.out.println("----------------------");

        Arrays.sort(animal);
        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
        }

        System.out.println("----------------------");

        int[] myArr1;
        int[] myArr2;
        int[] myArr3;
        int myArr4[];
        int myArr5[];

        int[][] my2DArr1;
        int[][] my2DArr2;
        int[][] my2DArr3;
        int my2DArr4[][];
        int my2DArr5[][];

        int[] my2DArr6[];
        int[] my2DArr7[];
        int[] my2DArr8[];
        int[] my2DArr9[];
        int[] my2DArr10[];

        int[][][] my3DArr1;
        int[][] my3DArr2[];
        int[] my3DArr3[][];
        int my3DArr4[][][];


        int myArrLast1[];
        int myArrLast2[][];
        int myArrLast3[][][];


        //    int myArrLast4 [], myArrLast5 [][], myArrLast6 [][][];


        var now = Instant.now();
        System.out.println(now);

        var now2 = Instant.now();
        System.out.println(now2);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var date1 = LocalDate.of(2023, Month.MAY, 10);
        System.out.println(date1);

        var date2 = LocalDate.of(2023, 5, 10);
        System.out.println(date2);

        System.out.println(date1.plusDays(32));
        System.out.println(date2.minusMonths(3).minusDays(10));

    }
}