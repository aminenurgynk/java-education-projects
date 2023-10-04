package com.aminenurgynk;

public class StringMethods {

    public static void main(String[] args) {


        String adi1 = "Mehmet Caner";

        System.out.println(adi1.length());

        String adi2 = "Burak Delice";

        if (adi1 == adi2) {
            System.out.println("Aynı");
        } else {
            System.out.println("Değil");
        }

        if (adi1.equals(adi2)) {
            System.out.println("Aynı");
        } else {
            System.out.println("Değil");
        }

        String str1 = "Adana";
        String str2 = "Merkez";
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));


        String ogrenci = "Serkan"; // 'S', 'e', 'r', 'k', 'a', 'n'
        char[] karakterler = ogrenci.toCharArray();
        System.out.println(karakterler);

        for (int i = 0; i < karakterler.length; i++) {
            System.out.println(karakterler[i]);
        }

        System.out.println("--------------------");

        //0123
        String personel = "Aysu Cansu Peteksu Çağışlar";
        System.out.print(personel.charAt(0));
        System.out.print(personel.charAt(1));
        System.out.print("*");
        System.out.print("*");

        System.out.println("--------------------");

        System.out.println(personel.contains("su"));

        System.out.println("--------------------");

        String[] sonDurum = personel.split("su ");

        for (String item : sonDurum) {
            System.out.println(item);
            String name1 = "Mehmet Caner";

            System.out.println(name1.length());

            String name2 = "Burak Delice";

            if (name1 == name2) {
                System.out.println("Same");
            } else {
                System.out.println("not same");
            }

            if (name1.equals(name2)) {
                System.out.println("Same");
            } else {
                System.out.println("not same");
            }


            String student = "Serkan"; // 'S', 'e', 'r', 'k', 'a', 'n'
            char[] char1 = student.toCharArray();
            System.out.println(char1);

            for (int i = 0; i < char1.length; i++) {
                System.out.println(char1[i]);
            }

            System.out.println("--------------------");

            String personnel = "Aysu Cansu Peteksu Çağışlar";
            System.out.print(personnel.charAt(0));
            System.out.print(personnel.charAt(1));
            System.out.print("*");
            System.out.print("*");

            System.out.println("--------------------");

            System.out.println(personnel.contains("pe"));

            System.out.println(personnel.replace('u', 'T'));
        }

        System.out.println("--------------------");

        System.out.println(personel.replace('u', 'T'));


    }

}
