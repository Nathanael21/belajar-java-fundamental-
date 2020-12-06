package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("======Aritmatika======");
        // operator aritmatika
        /*
        * Penjumlahan (+)
        * pengurangan (-)
        * perkalian (*)
        * pembagian (/)
        * modulus (%)
        */
        int a = 11;
        int b = 2;
        int hasil;
        System.out.println("======Penjumlahan======");
        hasil = a + b;
        System.out.printf("hasil dari %d + %d = %d \n",a,b,hasil);
        System.out.println("======End Penjumlahan======");
        System.out.println("======Pengurangan======");
        hasil = a - b;
        System.out.printf("hasil dari %d - %d = %d \n",a,b,hasil);
        System.out.println("======End Pengurangan======");
        System.out.println("======Perkalian======");
        hasil = a * b;
        System.out.printf("hasil dari %d + %d = %d \n",a,b,hasil);
        System.out.println("======End Perkalian======");
        System.out.println("======Pembagian======");
        hasil = a / b;
        System.out.printf("hasil dari %d / %d = %d \n",a,b,hasil);

        float a1 = 10;
        float a2 = 3;
        float a3 = a1/a2;
        System.out.println("hasil dari " + a1 + "/" + a2 + "= " + a3);
        System.out.println("======End Pembagian======");
        System.out.println("======Modulus======");
        hasil = a%b;
        System.out.printf("hasil dari %d %% %d = %d \n",a,b,hasil);
        System.out.println("======End Modulus======");

        


    }
}
