package com.tutorial;

public class Main {
    public static void main(String[] args){

        int a,y;
        a = 5;
        y = hitung(a);
        System.out.println("hasil y = " + y);



    }
    static int hitung(int a){
        int hasil;
        hasil = (a + 2) * a;
        return hasil;
    }
}
