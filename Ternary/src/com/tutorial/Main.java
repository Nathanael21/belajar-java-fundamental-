package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,hasil;
        System.out.print("Masukan Nilai = ");
        Scanner User = new Scanner(System.in);
        hasil = User.nextInt();
        System.out.println(hasil);
        // variable a = (ekspresi/ketentuan) ? hall kalau benar : hall kalau salah;
        // pengganti if else singkat atau bila hanya memakai if dan else saja
        a = (hasil == 10) ? (hasil*hasil) : (hasil/2);
        System.out.println("hasil akhir = " + a);
    }
}
