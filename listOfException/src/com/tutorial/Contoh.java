package com.tutorial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Contoh {
    //kalau memakai FileNotFoundException yang ke handle hanya bagian FileInputStream yang lain tidak
    //karena dari itu memakai IOException agar ke handle semua
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("input2.txt");
        System.out.println((char)file.read());


        System.out.println("Akhir program");
    }
}
