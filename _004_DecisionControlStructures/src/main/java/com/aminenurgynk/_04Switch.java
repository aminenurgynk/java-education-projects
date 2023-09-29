package com.aminenurgynk;

public class _04Switch {

    public static void main(String[] args) {

        // A B C D E
        char letter = 'T';

        switch (letter) {

            case 'A':
                System.out.println("Selected : " + letter);
                break;

            case 'B':
                System.out.println("Selected : " + letter);
                break;

            case 'C':
                System.out.println("Selected : " + letter);
                break;

            case 'D':
                System.out.println("Selected : " + letter);
                break;

            default:
                System.out.println("The " + letter + "  you selected is not suitable.");
                break;
        }

        int daysOfWeek = 43;
        switch (daysOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter a number between 1 to 7 ");
                break;
        }

        System.out.println("---------------------");

        daysOfWeek = 5;
        String daysOfWeekValue = null;

        switch (daysOfWeek) {

            default:
                System.out.println("Enter a number between 1 to 7 ");
                break;

            case 1:
                daysOfWeekValue = "Monday";
                break;
            case 2:
                daysOfWeekValue = "Tuesday";
                break;
            case 3:
                daysOfWeekValue = "Wednesday";
                break;
            case 4:
                daysOfWeekValue = "Thursday";
                break;
            case 5:
                daysOfWeekValue = "Friday";
                break;
            case 6:
                daysOfWeekValue = "Saturday";
                break;
            case 7:
                daysOfWeekValue = "Sunday";
                break;

        }

        if (daysOfWeekValue == null) {

        } else {
            System.out.println("1st Case: " + daysOfWeekValue);
        }

        if (daysOfWeekValue != null) {
            System.out.println("2nd Case: " + daysOfWeekValue);
        }

        System.out.println("---------------------");

        // Hafta içi - hafta sonu
        // 1 2 3 4 5 - 6 7

        int dayTime = 7;
        switch (dayTime) {

            case 1:
                System.out.println("Mon.");
            case 2:
                System.out.println("Tue.");
            case 3:
                System.out.println("Wed.");
            case 4:
                System.out.println("Thu.");
            case 5:
                System.out.println("Fri.");
                System.out.println("Weekdays");
                break;

            case 6:
                System.out.println("Sat.");
            case 7:
                System.out.println("Sun.");
                System.out.println("Weekand");
                break;

            default:
                System.out.println("Enter a number between 1 to 7 ");
                break;
        }



    }

}
