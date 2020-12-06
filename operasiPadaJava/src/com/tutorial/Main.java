package com.tutorial;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        // mengubah array menjadi string
        System.out.println("====Merubah Array Menjadi String====");
        print(array1);
        //mengcopy array
        System.out.println("====Mengcopy Array====");
        int banyak = array1.length;
        int[] array2 = new int[banyak];
        print(array1);
        print(array2);
        System.out.println("dicopy menggunakan loop");
        copyLoop(array1,array2);
        System.out.println("dicopy menggunakan copyof dari java");
        // Arrays.copyOf( "(array mana yang mau di copy)" , "(sampai mana mau dicopynya (jumlah))");
        int[] array3 = Arrays.copyOf(array1,banyak);
        print(array3);
        // mengcopy dengan mengambil angka yang tidak tentu dari awal
        System.out.println("====menggunakan copyOfRange====");
        // mengambil angka sesuai range seperti 3-4
        int[] array4 = Arrays.copyOfRange(array1,2,8);
        System.out.println("Array menjadi --> " + Arrays.toString(array4));
        // fill array
        int[] array5 = new int[20];
        print(array5);
        Arrays.fill(array5,1);
        print(array5);
        System.out.println("====Komparas Array====");
        int[] array6 = {1,2,3,4,5};
        int[] array7 = {1,2,3,4,5};
        // arrays.equal untuk menyamakan array
        if (Arrays.equals(array6,array7)){
            System.out.println("arraynya Sama");
        }else{
            System.out.println("arraynya beda");
        }

        // mengecek array mana yang lebih besar
        System.out.println("====Mencari array yang lebih besar====");
        System.out.println(Arrays.compare(array6,array1));

        // mengecek incex yang berbeda
        System.out.println("====Mencari index array yang berbeda====");
        System.out.println(Arrays.mismatch(array6,array7));


        //menyortir array
        System.out.println("====Menyortir Array====");
        int[] array8 = {1,122,3,43,54,6,57,8,91,10};
        print(array8);
        Arrays.sort(array8);
        print(array8);

        //Serach array
        System.out.println("====Array Search====");
        print(array8);
        Scanner user = new Scanner(System.in);
        System.out.print("Masukan yang mau di cari = \n");
        int hasil = user.nextInt();
        int udin = Arrays.binarySearch(array8,hasil);
        System.out.println("angka = " + hasil + " ada di index ke-" + udin);
    }
    private static void print(int[] arr){
        System.out.println("menjadi --> " + Arrays.toString(arr));
    }
    public static void copyLoop(int[] arr1,int[] arr2){
        int banyak = arr1.length;
        for (int i = 0; i < banyak;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Array menjadi --> " + Arrays.toString(arr2));
    }

}
