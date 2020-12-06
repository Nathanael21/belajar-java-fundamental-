package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("======Recursive======");
        Scanner User = new Scanner(System.in);
        System.out.print("Masukan Nilai = ");
        int udin = User.nextInt();
        int hasil = penjumlahan(udin);
        System.out.println("Hasil = " + hasil);
    }

    public static int penjumlahan(int hasil){
        System.out.println("Parameter = " + hasil);
        if (hasil == 0){
            return hasil;
        }
        return hasil + penjumlahan(hasil - 1);

    }
    public static void recursive(int udin) {
        System.out.println("nilai Udin = " + udin);
        udin--;
        if (udin == 0){
            return;
        }
        recursive(udin);

    }
}
