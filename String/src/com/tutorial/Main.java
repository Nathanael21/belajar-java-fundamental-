package com.tutorial;

import java.util.Arrays;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kata = "halo guys";
        char[] kataChar = {'h','a','l','o'};
        System.out.println(kataChar);
        System.out.println(Arrays.toString(kataChar));
        // mengambil komponen pada string/char
        System.out.println("Komponen pertama dari Kata Char = " + kataChar[0]);
        System.out.println("Komponen pertama dari kata = " + kata.charAt(0));

        // mengubah kata halo menjadi calo secara tidak langsung
        kataChar[0] = 'c';
        System.out.println("Kata char setelah diubah menjadi = " + Arrays.toString(kataChar));
        kata = "c" + kata.substring(1,4);
        System.out.println("Menjadi = " + kata);
        Scanner User = new Scanner(System.in);
        System.out.print("masukan nama = ");
        String nama = User.next();
        System.out.print("Masukan String = ");
        String usString = User.next();
        printAddress(nama,usString);
        String str_1 = "test";
        printAddress("str_1" , str_1);
        String str_2 = "halo";
        printAddress("str_2" , str_2);

    }
    public static void printAddress(String nama, String kata){
        int add = System.identityHashCode(kata);
        System.out.println(nama + " = " + kata + "\t || address = " + Integer.toHexString(add));
    }

}
