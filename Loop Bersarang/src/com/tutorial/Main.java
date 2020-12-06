package com.tutorial;

public class Main {
    public static void main(String[] args){
        int i,j;
        System.out.println("kotak");
        for (i = 1; i <= 5;i++){
            for (j = 1; j <= 5 ; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("segitiga");

        for (i = 1; i <= 5;i++){
            for (j = 1; j <= 5 ; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("Segitiga Kebalik");
        for (i = 1; i <= 5;i++){
            for (j = 1; j <= 5 ; j++){
                System.out.print("* ");

                if (i + j == 6){
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("Segitiga");
        for (i = 1; i <= 9;i++){
            for (j = 1; j <= 9 ; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }else if((i + j) == 10){
                    break;
                }
            }
            System.out.print("\n");
        }
        System.out.println("wajik");
        for( i = 0; i < 9; i++){
            for ( j = 0; j < 9; j++){
                if ((i + j < 4) || (i - 5 == j) || (i - 6 == j) || (i - 7 == j) || (i - 8 == j)){
                    System.out.print("  ");
                }else if ((j - 5 == i) || (i + j > 12)) {
                    break;
                }else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }


    }
}
