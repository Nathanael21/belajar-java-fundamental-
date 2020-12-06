package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int arrayAngka[] = {11,12,13,14,15,16,17,18,19,20};
        int banyak = arrayAngka.length;
        // looping dengan properti arraynya
        for (int i = 0; i < banyak;i++){
            System.out.println("ini Array ke-" + i + " dengan isi data = " + arrayAngka[i]);
        }

        // looping khususon untuk colection <-- array
        System.out.println("====For each====");
        for (int udin:arrayAngka
             ) {
            System.out.println("Nilai yang berada pada arrayAngka = " + udin);
        }




    }
}
