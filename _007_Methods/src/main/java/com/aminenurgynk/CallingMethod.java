package com.aminenurgynk;

public class CallingMethod {

    String greet(String adi) {
        return "hii " + adi;
    }

    void receiveGreet() {
        System.out.println("SELAM AL METODU");
    }

    public static void main(String[] args) {

        CallingMethod obj = new CallingMethod();
        obj.receiveGreet();

        System.out.println(obj.greet("Ali") + "Hiii ");

        String sonuc = obj.greet("Aminenur");
        System.out.println(sonuc);

        String campaign =
                "on salee\t"
                        + obj.greet("Orhun");

        System.out.println(campaign);


    }

}
