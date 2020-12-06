package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("======Conversi Numeric======");
        int i = 450; //32-bit
        System.out.println("nilai int i = " + i);
        //memperluas rentang tipe data ke yang lebih besar
        long g = i; //64-bit
        System.out.println("nilai i menjadi = " + g);
        // mengkonversi dari jumlah bit kecil ke besar tidak ada masalah

        // konversi besar ke kecil
        //(byte nibyte = i;) -> akan erorr harus melakukan konversi terlebih dahulu

        // konversi data integer ke byte
        byte nilaibyte = (byte)i;
        System.out.println("nilai byte sekarang = " + nilaibyte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);
        // mengkonversi akan mengubah nilai asli dari nilai tersebut

        // casting pembagian
        int a = 250;
        float b = 11;
        float c  = a/b;
        System.out.printf("%d / %f = %f \n",a,b,c);
        System.out.println("========2=======");

        int x = 10;
        int y = 4;
        float z = (float)x/y;
        System.out.printf("%d / %d = %f",x,y,z);

    }
}
