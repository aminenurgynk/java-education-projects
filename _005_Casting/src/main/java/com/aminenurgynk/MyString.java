package com.aminenurgynk;

public class MyString {

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }

        System.out.println("\n-----------------------");
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet.toUpperCase());
        System.out.println(alphabet.length());

        System.out.println("\n-----------------------");
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(alphabet2);

        System.out.println("\n-----------------------");
        String sentence = """
                abcdefghijklmnopqrstuvwxyz""";

        System.out.println(sentence);

        System.out.println("\n-----------------------");
        System.out.println(alphabet == alphabet2);
        System.out.println(alphabet == sentence);
        System.out.println(alphabet.charAt(25));


    }

}
