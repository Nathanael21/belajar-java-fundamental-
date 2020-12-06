package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] arrayAngka = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayAngka1 = new int[10];
        System.out.println(arrayAngka);
        System.out.println(arrayAngka1);
        arrayAngka1 = arrayAngka;
        System.out.println("Array1 --> " + Arrays.toString(arrayAngka));
        System.out.println("Array2 --> " + Arrays.toString(arrayAngka1));

        arrayAngka[0] = 100;
        arrayAngka1[3] = 14;
        System.out.println(arrayAngka);
        System.out.println(arrayAngka1);
        //utnuk metode ini mengubah satu array atau komponen array yang sama semua akan berubah
        System.out.println("Array1 --> " + Arrays.toString(arrayAngka));
        System.out.println("Array2 --> " + Arrays.toString(arrayAngka1));

        ubahArray(arrayAngka);
        System.out.println("Array1 --> " + Arrays.toString(arrayAngka));
        System.out.println("Array2 --> " + Arrays.toString(arrayAngka1));
    }
    //method yang argumennya berupa reference
    //pass by reference bukan pass by value
    private static void ubahArray(int[] arr){
        arr[0] = 255;
    }
}
