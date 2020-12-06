package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        System.out.println("Menggunakan for");
        int i,fn,fn_1,fn_2,n;
        System.out.print("Masukan Nilai n = ");
        n = User.nextInt();
        fn_1 = 1;
        fn_2 = 0;
        fn = 1;
        for (i = 1; i <= n;i++){
            System.out.println("nilai ke = " + i + " menjadi = " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }



































        System.out.println("Menggunakan While");

        fn_1 = 1;
        fn_2 = 0;
        fn = 1;
        i = 1;
        while(i <= n ){
            System.out.println("Nilai ke = " + i + " menjadi = " + fn);
            // Update nilai fn
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            i++;
        }


































        System.out.println("Menggunakan do while");

        fn = 1;
        fn_1 = 1;
        fn_2 = 0;
        i =1;
        do{
            System.out.println("Nilai ke = " + i + " menjadi = " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

        i++;

        }while(i <= n);


















    }

}
