package com.tutorial;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = new FileInputStream("input.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());

        /*
        * untuk menaruh file yang akan dibaca dari java bila mau di buka dari cmd maka
        * kita harus menyimpan di bagian repo out dimana sejajar dengan folder
        * Main.class
        *
        * untuk yang javanya sudah menjad file JAR maka dia harus disimpan di folder yang ada
        * jarnya okey mantap begitu
        *
        * */
















    }




}
