package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String waw;
        Scanner Udin = new Scanner(System.in);
        waw = Udin.nextLine();
        String hasil = "waw";
        if (waw.compareTo(hasil) == 0){
            System.out.println("sama");
        }else{
            System.out.println("Beda");
        }

        int a = 5;
        int b = 3;
        if (a == 5){
            if (b == 3){
                System.out.println("Mantul anjing = " + b);
            }else{
                System.out.println("Salah sekali = " + b);
            }
        }else{
            System.out.println("gobol banget lu = " + a);
        }
    }
}
