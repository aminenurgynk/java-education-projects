package com.aminenurgynk;
public class _06Continue {

    public static void main(String[] args) {


        // continue
        for (int i = 0; i < 25; i++) {


            // find 20 and call back again

            if(i == 20) {

                System.out.println("20");
                continue; // contunie

                //break; // out
            } else {
                System.out.println(i);
            }

        }

    }

}
