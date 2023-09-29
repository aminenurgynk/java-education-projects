package com.aminenurgynk;

public class Wrapper {

    public static void main(String[] args) {

        int intAge = 10;
        Integer integerAge = 15;


        int result1 = intAge + integerAge;
        System.out.println(result1);

        Integer result2 = intAge + integerAge;
        System.out.println(result2);

        String result3 = integerAge.toString();
        System.out.println(result3);

        String result4 = Integer.valueOf(intAge).toString();
        System.out.println(result4);

        String result5 = integerAge + "";
        System.out.println(result5);

        Boolean.valueOf(false);
        Byte.valueOf((byte) 0);
        Short.valueOf((short) 0);
        Integer.valueOf(0);
        Long.valueOf(0);
        Float.valueOf(0);
        Double.valueOf(0);
        Character.valueOf('A');


        String password = "123456789";
        int intpassword = Integer.parseInt(password);
        Integer integerpassword = Integer.valueOf(intpassword);
        String result6 = integerpassword.toString();

    }

}
