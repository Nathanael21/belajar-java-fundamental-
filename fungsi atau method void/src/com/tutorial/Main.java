package com.tutorial;

public class Main {
    public static void main(String[] args){
        // void merupakan type data kosong
        System.out.println("nilai yang di kembalikan dari fungsi simple = " + simple());
        udinVoid("gila siah");
        ucapanNama("Udin");
    }


    public static void ucapanNama(String nama){
        System.out.println("Selamat Pagi, " + nama);
    }

    public static void udinVoid(String edan){
        System.out.println(edan);
    }

    public static float simple(){
    // terdapat nilai yang di kembalikan dengan (return)
        return 10.5f;
    }
}
