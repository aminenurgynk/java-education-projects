package com.aminenurgynk;

public class Hello implements IHello, IExample {

    public static void main(String[] args) {

        Hello obj = new Hello();
        obj.sayHii();

        obj.rule3("Aminenur Goynuk");
    }

    @Override
    public void sayHii() {
        System.out.println("Hiii All!");
    }

    @Override
    public void rule2() {
        System.out.println("2nd rule");
    }

    @Override
    public void rule3(String message) {

        System.out.println("3th rule : " + message);
    }

    @Override
    public void writeYourName() {
        // TODO Auto-generated method stub

    }

}
