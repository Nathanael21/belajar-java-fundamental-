package com.tutorial;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        // latihan matrix
        int[][] MA = {
                {1, 2, 4}
        };
        int[][] MB = {
                {11, 12},
                {13, 14}
        };

        print(MA);
        System.out.print("\n");
        print(MB);
        System.out.print("\n");
        tambahMatrix(MA, MB);
        kaliMatrix(MA,MB);
    }

    public static void print(int[][] arr) {
        int baris = arr.length;
        // System.out.println(baris);
        int kolom = arr[0].length;
        //System.out.println(kolom);

        for (int i = 0; i < baris; i++) {
            System.out.print("[");
            for (int j = 0; j < kolom; j++) {
                System.out.print(arr[i][j]);

                if (j < kolom - 1) {
                    System.out.print(",");

                } else {
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
    }

    public static void tambahMatrix(int[][] arrA, int[][] arrB) {
        int barisA = arrA.length;
        int barisB = arrB.length;
        int kolomA = arrA[0].length;
        int kolomB = arrB[0].length;

        int[][] hasil = new int[barisA][kolomA];
        if (barisA == barisB && kolomA == kolomB) {
            for (int i = 0; i < barisA; i++){
                //ngambil per baris
                for (int j = 0; j < kolomA;j++){
                    //ngambil per kolom

                    // masukin i sebagai indeks pertama dimana indeks pertama merupakan baris dan yang ke dua adalah kolom karena
                    // jumlah baris harus sama jadi kita hanya mengambil salah satu baris dan kolom dari array
                    hasil[i][j] = arrA[i][j] + arrB[i][j];
                }
            }
            print(hasil);
        } else {
            System.out.println("gagal bous jumlahnya ga sama");
        }
    }


    public static void kaliMatrix(int[][] arrA, int[][] arrB){
        int barisA = arrA.length;
        int barisB = arrB.length;
        int kolomA = arrA[0].length;
        int kolomB = arrB[0].length;

        int buffer;

        int[][] hasilKali = new int[barisA][kolomB];

       if (kolomA == barisB){

        for (int i = 0; i < barisA;i++){
            // mengambil baris A
            for (int j = 0; j < kolomB;j++){
            // mengambil baris B
                buffer = 0;
               for (int k = 0; k < kolomA; k++){
                   // mengambil kolom yang A
                   // memasukan baris dari yang dan yang k
                   buffer += arrA[i][k] * arrB[k][j];
               }
                hasilKali[i][j] = buffer;
            }
        }
        System.out.println("\n");
        print(hasilKali);
        // kesimpulan jika a . b maka jumlah baris akan mengikuti baris a dan kolomnya
        // akan mengikuti kolom si b
       }else{
           System.out.println("Jumlah Kolom atau Baris tidak sama");
       }
    }
}


