package com.aminenurgynk;

public class _02ForEach {

    public static void main(String[] args) {

        // Student list
        String student1 = "Ahmet";
        String student2 = "Mehmet";
        String student3 = "Ali";
        String student4 = "Veli";
        String student5 = "Zeynep";
        String student6 = "Ayşe";

        // Array
        String [] students = {"Ahmet", "Mehmet", "Ali", "Veli", "Zeynep", "Ayşe"};

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println("-------------");

        //    0    1    2    3   4
        int myNumbers[] = { 100, 250, 300, 75, 45  };

        for (int myNumber : myNumbers) {
            System.out.print(myNumber*3 + " ");
        }

    }

}
