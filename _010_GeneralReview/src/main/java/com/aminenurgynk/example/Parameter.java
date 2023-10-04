package com.aminenurgynk.example;

public class Parameter {

    private static int lengthOfWord(String word) {
        return word.length();
    }

    private static int lengthOfWord(String word, char case1) {

        if (case1 == 'Z') {
            return 0;
        } else if (case1 == 'A') {
            System.out.println(word.toUpperCase().trim());
            return word.toUpperCase().trim().length();
        } else {
            System.out.println(word.trim());
            return word.length();
        }
    }

    public static void main(String[] args) {
        int result = lengthOfWord(" Aminenur ");
        System.out.println(result); // 7

        result = lengthOfWord("Aminenur", 'Z');
        System.out.println(result);

    }


}