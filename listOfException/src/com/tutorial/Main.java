package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayData= {0,1,2,3};
        Scanner user = new Scanner(System.in);
        System.out.print("Masukan pilihan : ");
        int pilihan = user.nextInt();
        // menggunakan exceptio biasa
        System.out.println("Exception biasa");
        try {
            System.out.printf("Pilihan ke-%d adalah %d\n\n",pilihan,arrayData[pilihan]);
        }catch (Exception e){
            System.err.println(e);
        }

        //menggunakan exceptio pada fungsi
        System.out.println("Exception pada fungsi");
        int dataDariArray = ambilDataArray(arrayData,pilihan);
        System.out.printf("Nilai index ke %d adalah %d\n\n",pilihan,dataDariArray);


        //exception throws baik method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try {
            data2 = ambilDataArray2(arrayData,pilihan);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("Nilai dari array ke-%d adlalah %d\n\n",pilihan,data2);

        System.out.println("\n\nAkhir program");
    }
    private static int ambilDataArray2(int[] arr , int index) throws Exception{
        int hasil = arr[index];
        return hasil;
    }
    private static int ambilDataArray(int[] arr , int index){
        int hasil = 0;
        try {
            hasil = arr[index];
        }catch (Exception e){
            System.err.println(e);
        }
        return hasil;
    }


}
