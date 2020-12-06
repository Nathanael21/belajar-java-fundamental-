package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        System.out.println("Masukan angka integer");
        int angka = User.nextInt();
        printAngka(angka);
        System.out.println("masukan angka Float");
        float angka1 = User.nextFloat();
        printAngka(angka1);
    }
    private static void printAngka(float angka){
        System.out.println("nilai ini merupakan nilai float dengan angka = " + angka);
    }

    private static void printAngka(int angka){
        System.out.println("Angka ini adalah integer dengan nilai = " + angka);
    }
}
