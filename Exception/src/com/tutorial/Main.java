package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};
        FileInputStream fileInput = null;
        Scanner user = new Scanner(System.in);
        System.out.print("nilai array ke : ");
        int pilihan = user.nextInt();

//        //exception handling (try,catch,finally)
//        try {
//            System.out.printf("Index ke-%d adalah %d",pilihan,array[pilihan]);
//        }catch (Exception exceptionMessage){
//            System.err.println(exceptionMessage);
//        }
//
//        //exception untuk runtime erorr saat file tidak ada
//        try {
//            fileInput = new FileInputStream("input.text");
//        }catch (IOException e){
//            System.err.println(e);
//        }

        //menggabungkan 2 exception
        try {
            System.out.printf("Index ke-%d adalah %d",pilihan,array[pilihan]);
            fileInput = new FileInputStream("input.text");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        }catch (IOException e){
            System.err.println("File tidak ditemukan");
        }finally {
            System.err.println("gagal");
        }


        System.out.println("\nakhir program");


    }

}
