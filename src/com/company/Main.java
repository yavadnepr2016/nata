package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(12) + 1;
        if (a == 12 || a == 1 || a == 2) {
            String q = " сейчас зима";
            System.out.print(q);
        } else if (a == 3 || a == 4 || a == 5) {
            String q = " сейчас весна";
            System.out.print(q);
        } else if (a == 6 || a == 7 || a == 8) {
            String q = " сейчас лето";
            System.out.print(q);
        } else if (a == 9 || a == 10 || a == 11) {
            String q = " сейчас осень";
            System.out.print(q);
        }
    }
}



