package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("======Pengelompokan Aritmatika======");
        int hasil = 20 * 2 + 10;
        System.out.println("hasil = " + hasil);
        double wadaw = Math.sqrt(25);
        System.out.println(wadaw);
        Scanner userR = new Scanner(System.in);
        System.out.println("MENGHITUNG KELILING LINGKARAN");
        System.out.print("Jari jari = ");
        int r;
        r = userR.nextInt();
        int hasils;
        hasils = 2 * (22/7) * r;
        System.out.println("Keliling menjadi = " + hasils);
    }
}
