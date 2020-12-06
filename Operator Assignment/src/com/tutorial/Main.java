package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("======Operator Assignment======");

        // Assignment Operator jumlah
        System.out.println("======Operator Assignment (+)======");
        int a = 1;
        a = a + 5;
        System.out.println("nilai a menjadi " + a);
        a += 10;
        System.out.println("nilai a menjadi " + a);

        // ASSignment Operator Kurang
        System.out.println("======Operator Assignment (-)======");
        int b = 10;
        b = b-2;
        System.out.println("nilai b menjadi " + b);

        b -= 3;
        System.out.println("nilai b menjadi " + b);

        System.out.println("======Operator Assignment (/)======");
        int c = 10;
        c = c/2;
        System.out.println("nilai c menjadi " + c);

        c /= 5;
        System.out.println("nilai c menjadi " + c);
        System.out.println("======Operator Assignment (*)======");
        int d = 2;
        d = d*2;
        System.out.println("nilai d menjadi " + d);
        d *= 4;
        System.out.println("nilai d menjadi " + d);

        System.out.println("======Operator Assignment (%)======");
        int e = 100;
        e %=10;
        System.out.println("nilai e menjadi " + e);


    }
}
