package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args){
        String kalimat = "udin siah teh belegug";
        // mengambil komponen String
        System.out.println("Komponen String = " + kalimat.charAt(5));

        // mengambil komponen Char banyak sekaligus
        System.out.println("kompnen Char banyak sekaligus = " + kalimat.substring(14,21));

        // concatenation (penggabungan 2 String)
        String kalimat_1 = kalimat.substring(5,9);
        String kalimat_2 = kalimat.substring(0,4);
        System.out.println("concatenation = " + kalimat_1 + " " +kalimat_2 + " goblog");
            // tanpa membuat String baru
        kalimat = kalimat + " pisan";
        System.out.println("concatenation menimpa = " + kalimat);

        //concat tanpa String
        int angka = 100;
        String kata = "makan cireng";
        System.out.println("concatenation tanpa string = " + kata + " " + angka);
            // akan otomatis terkonversi menjadi string

        // uppercase
        System.out.println(kalimat.toUpperCase());

        // Lowecase
        System.out.println(kalimat.toLowerCase());

        // replace
        String kalimat4 = kalimat.replace("belegug","tolol");
        System.out.println(kalimat4);

        // persamaan (equality)
        System.out.println("=====persamaan string pool");
        String kataInput = "test";//string pool
        String kataTest = "test" ; //string pool
        String kataAnput = new String("test"); // bukan string literal, dan tidak berada di string pool
        equalitation(kataInput,kataAnput);

        Scanner user = new Scanner(System.in);
        System.out.print("Masukan password = ");
        String inputUser1 = user.next();
        System.out.print("Masukan Ulang Password = ");
        String inputUser2 = user.next();
        equalitation(inputUser1,inputUser2);

        //comparasion
        String mobil1 = "honda sivic";
        String motor1 = "kawasaki W175";
        comparasion(motor1,mobil1);
    }

    public static void equalitation(String str1, String str2){
        // kalo pake (==) yang di check si addressnya
        // kalo pake (equals()) yang di check isinya (recommend)
        if (str1.equals(str2)){
            System.out.println("sama anjay");
        }else{
            System.out.println("beda anjay");
        }
    }
    public static void comparasion(String str1, String str2){
        // mencari kesalahan/perbedaan per huruf
        System.out.println(str1.compareTo(str2));
    }

}
