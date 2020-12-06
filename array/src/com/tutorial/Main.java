package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("====Array====");
        int []udin = {1,2,4,5};
        int banyak = udin.length;
        int i = 0;
        while(i < banyak){
            System.out.println(udin[i]);
            i++;
        }
        System.out.println("// float");
        float []arrayfloat = {13.5f,12.5f,25.5f,12.9f};
        banyak = arrayfloat.length;
        for (i = 0;i < banyak;i++){
            System.out.println(arrayfloat[i]);
        }
        System.out.println("// float new");
        float []arrayFloat = new float[5];
        banyak = arrayFloat.length;
        for (i = 0;i < banyak ; i++){
            System.out.println("array float ke-" + i + " dengan nilai = " + arrayFloat[i]);
        }


    }
}
