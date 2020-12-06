package com.tutorial;

public class Main {
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variable saja
        System.out.println("========Operator Unary========");
        int angkaMin = 1;
        System.out.printf("Unary '-(minus)' dari angka %d menjadi %d \n",angkaMin,-angkaMin );

        // unary decrement dan increment
        int angka2 = 10;
        System.out.println("angka 2 = " + angka2);
        System.out.println("=====Increment=====");
        angka2++;
        System.out.println("angka 2 menjadi " + angka2);
        System.out.println("=====Decrement=====");
        angka2--;
        System.out.println("angka 2 menjadi " + angka2);

        int a = 5;
        //masalah increment atau decrement prefix dan postfix
        System.out.printf("Nilai a menggunakan increment Prefix = %d \n", ++a);
        int b = 6;
        System.out.printf("Nilai a menggunakan increment Postfix = %d \n", b++);
        System.out.printf("Nilai a menggunakan increment Postfix = %d \n", b);

        //Unary Boolean dengan ! (negasi)

        boolean waw = true;
        System.out.println("nilai boolean = " + waw);
        System.out.println("nilai boolean = " + !waw);

    }
}
