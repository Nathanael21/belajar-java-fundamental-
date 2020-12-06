package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String case1;

        Scanner User = new Scanner(System.in);
        System.out.print("masukan nilai = ");
        case1 = User.nextLine();

        switch (case1) {
            case "wadaw" -> System.out.println("gila sih bener");
            case "gila" -> System.out.println("lutfi emang gila");
            case "lutfi" -> System.out.println("goblok emang");
            default -> System.out.println("Lu tolol");
        }


    }
}
