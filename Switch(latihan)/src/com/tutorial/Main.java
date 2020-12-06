package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        System.out.println("CALCULATOR");
        float a,b,hasil;
        String operator;

        System.out.print("Nilai a = ");
        a = User.nextFloat();
        System.out.print("Operator = ");
        operator = User.next();
        System.out.print("Nilai b = ");
        b = User.nextFloat();

        switch(operator){
            case "+":
                System.out.println("Penjumlahan");
                hasil = a + b;
                System.out.println("Hasilnya = " + hasil);

                break;
            case "-":
                System.out.println("Pengurangan");
                hasil = a - b;
                System.out.println("Hasilnya = " + hasil);
                break;
            case "*":
                System.out.println("Perkalian");
                hasil = a * b;
                System.out.println("Hasilnya = " + hasil);
                break;
            case "/":
                System.out.println("Pembagian");
                hasil = a / b;
                System.out.println("Hasilnya = " + hasil);
                break;
            case "%":
                System.out.println("Sisa Bagi");
                hasil = a % b;
                System.out.println("Hasilnya = " + hasil);
            default:
                System.out.println("Unknown Command ==> (" + operator + ")");
                break;
        }
    }
}
