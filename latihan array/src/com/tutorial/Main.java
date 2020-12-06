package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        // penjumlahan array
        int[] array = {1,2,3,4,12,4,15,12,41,212,312,21};
        int[] array1 = {11,12,13,34,122,44,15,112,41,212,312,21};
        int[] array3 = new int[array1.length];
        penjumlahan(array,array1,array3);

        // menggabungkan array
        System.out.println("====Menggabungkan Array====");
        menggabungkanArray(array,array1);
        // sortir terbalik
        System.out.println("====sortir terbalik====");
        sortirTerbalik(array1);
        System.out.println("====cara2");
        reverse(array1);
    }

    public static void print(int[] arr, String pesan){
        System.out.println("Array " + pesan + "--> " + Arrays.toString(arr));
    }

    public static void penjumlahan(int[] arr1,int[] arr2,int[] arr3){
        int banyak = arr1.length;
        for (int i = 0 ; i < banyak;i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        print(arr1,"ke-1 ");
        print(arr2,"ke-2 ");
        print(arr3,"Hasil penjumlahan ");
    }

    public static void menggabungkanArray(int[] arr1,int[] arr2){
        int[] array = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length;i++){
            array[i] = arr1[i];
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < arr2.length;i++){
            array[i + arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sortirTerbalik(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("maka menjadi");
        int[] arrReverse = Arrays.copyOf(arr,arr.length);
        for (int i = 0;i < arr.length; i++){
            arr[i] = arrReverse[arrReverse.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //mengubah indeks
        System.out.println("menjadi");
        int buffer;
        for (int i = 0; i < arr.length/2 ; i++){
            buffer = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buffer;
        }
        System.out.println(Arrays.toString(arr));
    }
}
