package com.tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("====Arrays Multi Dimensi====");
        // dengan assignment
        int[] arraySatuDimensi = {1,2,3,4,5,6,7,8,9,10};
        int[][] arrayDuaDimensi = {
                {1,2,3,4,5,6,7,8,9,10},
                {11,12,13,14,15,16,17,18,19,20}
        };
        printArraySatuDimensi(arraySatuDimensi);
        System.out.println("\n=== Ngeprint dengan cara yang pertama");
        printArrayDuaDimensiPertama(arrayDuaDimensi);
        System.out.println("\n==== ngeprint dengan cara yang kedua");
        printArrayDuaDimensiKedua(arrayDuaDimensi);
        // array dua dimensi dengan deklarasi
        System.out.println("\n==== array dua dimensi dengan deklarasi");
        //array 1 dimensi
        int[] arrayAngka = new int[5];
        printArraySatuDimensi(arrayAngka);
        System.out.println("\n===== untuk dua dimensi");
        int[][] arrayAngka2 = new int[5][4];
        printArrayMultiDimensiLooping(arrayAngka2);
        System.out.println("\n==== Looping manual");
        printArrayMultiDimensiLoopingManual(arrayAngka2);
        System.out.println("\n==== Looping Foreach");
        printArrayMultiDimensiForEach(arrayAngka2);
    }

    public static void printArraySatuDimensi(int[] arr){
        System.out.println("Array 1 Dimensi --> " + Arrays.toString(arr));
    }

    public static void printArrayDuaDimensiPertama(int[][] arr){
        System.out.println("Arrays 2 Dimensi (1) --> " + Arrays.toString(arr[0]));
        System.out.println("Arrays 2 Dimensi (2) --> " + Arrays.toString(arr[1]));
    }
    public static void printArrayDuaDimensiKedua(int[][] arr){
        System.out.println("Arrays 2 Dimensi --> " + Arrays.deepToString(arr));
    }
    public static void printArrayMultiDimensiLooping(int[][] arr){
        int banyak = arr.length;
        for (int i = 0; i < banyak; i++){
            System.out.println("Arrays Multi Dimensi (" + i + ") --> " + Arrays.toString(arr[i]));
        }
    }
    public static void printArrayMultiDimensiLoopingManual(int[][] arr){
        int banyak = arr.length;
        for (int i = 0; i < banyak; i++){
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }
    public static void printArrayMultiDimensiForEach(int[][] arr){
        for (int[] baris: arr) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
    }
}
