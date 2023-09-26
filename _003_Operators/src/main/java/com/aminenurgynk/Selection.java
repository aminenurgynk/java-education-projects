package com.aminenurgynk;

public class Selection {

    public static void main(String[] args) {

        int vatingAge=1 , ageLimit=18;

        System.out.println(vatingAge >= ageLimit);


        // decision-making mechanism

        if (vatingAge >= ageLimit) {
            System.out.println("You can vote. ");
        } else {
            System.out.println("You can not vote. ");
            System.out.println("You can use it " + (ageLimit - vatingAge) + " year later.");
        }

        System.out.println( (vatingAge >= ageLimit) ? "Y" :"N");


        System.out.println( (vatingAge >= ageLimit)
                ?

                "You can vote. "


                :

                "You can not vote!\n" +
                        "You can use it " + (ageLimit - vatingAge) + " year later.");

    }
}
