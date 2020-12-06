package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int input = User.nextInt();
        int hasil = fibo(input,"atas");
        System.out.println("nilai fibonaci ke-"+ input +"Hasil = " + hasil);
    }

    public static int fibo(int angka,String daun){
        System.out.println("Daun = " + daun);
        System.out.println("Angka ke-" + angka);
            if (angka == 1 || angka == 0){
                return angka;
            }else{

        return fibo(angka - 1,"Kiri") + fibo(angka - 2,"kanan");
            }

    }
}
