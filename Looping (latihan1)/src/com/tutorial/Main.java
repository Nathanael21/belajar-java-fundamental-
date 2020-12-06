package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a,b,hasil;
        Scanner User = new Scanner(System.in);
        System.out.print("masukan nilai Awal = ");
        a = User.nextInt();
        System.out.print("Masukan nilai Akhir = ");
        b = User.nextInt();

        hasil = 0;
        System.out.println("======Mengguanakan While======");
        while(a < b){
             hasil += a;
            System.out.println("Ditambah = " + a + " menjadi = " + hasil );

            a++;
        }

        System.out.println("======Mengguanakan DoWhile======");
        System.out.print("Masukan Nilai Awal = ");
        a = User.nextInt();
        System.out.print("Masukan Nilai Akhir = ");
        b = User.nextInt();
        hasil = 0;
        do {
            hasil+=a;
            System.out.println("Ditambah = " + a + " menjadi " + hasil);
            a++;
        }while(a < b);

        System.out.println("======Mengguanakan for======");
        System.out.print("Masukan Nilai awal = ");
        a = User.nextInt();
        System.out.print("Masukan Nilai Akhir = ");
        b = User.nextInt();
        hasil = 0;
        for (;a < b ; a++ ){
            hasil+=a;
            System.out.println("Ditambah = " + a + " Menjadi = " + hasil);
        }
    }
}
