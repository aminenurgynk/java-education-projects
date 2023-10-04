package com.aminenurgynk.review;

public class _02_Operators {
    public static void main(String[] args) {

        int s1 = 10, s2 = 4;
        float result;
        result = s1 + s2;
        System.out.println(result);

        result = s1 - s2;
        System.out.println(result);

        result = s1 * s2;
        System.out.println(result);

        result = (float) s1 / s2;
        System.out.println(result);

        result += s1;
        System.out.println(result); // 12.5

        result++;
        System.out.println(result); // 13.5

        ++result;
        System.out.println(result); // 14.5


        String user = "Mehmet";
        String password = "123";

        boolean control = (user == "Mehmet");
        System.out.println(control);

        //    true              ve   true
        boolean control2 = ((password == "Mehmet") && (password == "123"));
        System.out.println(control2);


    }
}