package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("======Operator Logika======");
        Scanner User = new Scanner(System.in);
        int nilaiBenar,nilaiTebakan;
        boolean Hasil;
        nilaiBenar = 5;
        System.out.print("Masukan Nilai Tebakan = ");
        nilaiTebakan = User.nextInt();
        System.out.println("Nilai Tebakan Anda = " + nilaiTebakan);
        System.out.println("Nilai Yang Seharusnya Anda Tebak = " + nilaiBenar);

        Hasil = (nilaiBenar == nilaiTebakan);
        System.out.println("Status Anda = " + Hasil);

        // Operasi Aljabar BOOLEAN

        System.out.print("Masukan Nilai Antara 2-5 = ");
        nilaiTebakan = User.nextInt();
        Hasil = (nilaiTebakan > 4 ) && (nilaiTebakan < 6);
        System.out.println("Status Anda = " + Hasil);

    }
}
