package com.tutorial;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        int panjang,lebar;
        while(true){
        System.out.print("Masukan Panjang = ");
        panjang = User.nextInt();
        System.out.print("Masukan Lebar = ");
        lebar = User.nextInt();
       gambarKotak(panjang,lebar);
       luas(panjang,lebar);
       keliling(panjang,lebar);

            System.out.println("Apakah lagi (Y/N)");
            String lagi = User.next();
            if (lagi.equals("Y") || lagi.equals("y")){
                continue;
            }else{
                System.out.println("Thank You!");
                break;
            }
        }

    }

    public static void gambarKotak(Integer panjang,Integer lebar){
        for (int i = 1; i <= panjang;i++){

            for (int j = 1; j <= lebar;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void luas(int panjang,int lebar){
        int hasil;
        hasil = panjang * lebar;
        System.out.println("Luasnya = " + hasil);
    }
    public static void keliling(int panjang,int lebar){
        int hasil;
        hasil = 2*(panjang + lebar);
        System.out.println("Kelilingnya = " + hasil);
    }
}



