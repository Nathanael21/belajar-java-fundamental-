package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String responAwal,pilihan;
        double sisi,hasil,panjang,lebar,r;
        System.out.println("======Hitung Luas Persegi | Persegi Panjang | Lingkaran======");
        Scanner User = new Scanner(System.in);
        System.out.print("pilih bangun datar yang mau dihitung = ");
        responAwal = User.nextLine();

        if(responAwal.equals("Persegi") || responAwal.equals("persegi")){
            System.out.print("Pilih Luas atau Keliling = ");
            pilihan = User.next();
            if (pilihan.equals("Luas") || pilihan.equals("luas")){
                System.out.print("Masukan besar sisi = ");
                sisi = User.nextDouble();
                hasil = sisi * sisi;
                System.out.println("Hasil Luas Persegi Kamu = " + hasil);
            }else{
                System.out.print("Masukan besar sisi = ");
                sisi = User.nextDouble();
                hasil = 4 * sisi;
                System.out.println("Hasil Keliling Persegi Kamu = " + hasil);
            }
        }else if(responAwal.equals("Persegi Panjang") || responAwal.equals("persegi panjang")){
            System.out.print("Pilih Luas atau Keliling = ");
            pilihan = User.next();
            if (pilihan.equals("Luas") || pilihan.equals("luas")){
                System.out.print("Masukan besar Panjang = ");
                panjang = User.nextDouble();
                System.out.print("Masukan besar Lebar = ");
                lebar = User.nextDouble();
                hasil = panjang * lebar;
                System.out.println("Besar Luas Persegi Panjang Kamu = " + hasil);
            }else{
                System.out.print("Masukan besar Panjang = ");
                panjang = User.nextDouble();
                System.out.print("Masukan besar Lebar = ");
                lebar = User.nextDouble();
                hasil = 2 * (panjang + lebar);
                System.out.println("Besar Keliling persegi panjang kamu = " + hasil);
            }
        }else if (responAwal.equals("Lingkaran") || responAwal.equals("lingkaran")){
            System.out.print("Pilih Luas atau Keliling = ");
            pilihan = User.next();
            if (pilihan.equals("Luas") || pilihan.equals("luas")){
                System.out.print("Masukan Jari-Jari = ");
                r = User.nextDouble();
                hasil = 3.14 * (Math.pow(r,2));
                System.out.println("Besar Luas lingkarang kamu = " + hasil);
            }else{
                System.out.print("Masukan Jari-Jari");
                r = User.nextDouble();
                hasil = 2 * 3.14 * r;
                System.out.println("Besar Keliling lingkaran kamu = " + hasil);
            }
        }else{
            System.out.println("Unknown Command");
        }
    }
}
