package com.tutorial;

public class Main {
    public static void main(String[] args) {

        int awal = 10;
        int range = 10;
        int hasil = 10;
        int interval = 10;
        for (int j = 1; j <= interval;j++){
            for(int i = 1;i <= range;i++){
                System.out.print(" " + hasil);
                hasil += awal;
            }
            System.out.println();
            range -=1;
            awal-=1;
            hasil = range;
        }



    }
}
