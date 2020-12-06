package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("======userInput======");
        System.out.println("=================HITUNG LUAS=====================");
        int panjang,lebar,luas;
        System.out.print("Masukan Panjang = ");
        Scanner userPanjang = new Scanner(System.in);
        panjang = userPanjang.nextInt();
        System.out.print("Masukan Lebar = ");
        Scanner userLebar = new Scanner(System.in);
        lebar = userLebar.nextInt();
        luas = panjang * lebar;
        System.out.println("LUAS = " + luas);

    }
}
