package com.tutorial;

public class Main {
    public static void main (String[] args){
        System.out.println("======Operator Komparasi======");
        // persamaan
        int a,b;
        a = 2;
        b = 3;
        System.out.printf("%d apakah = %d ? (%s) \n",a,b,(a==b));
        a +=1;
        System.out.printf("%d apakah = %d ? (%s) \n",a,b,(a==b));

        //pertidak samaan

        float c,d;
        c = 10;
        d = 10;
        System.out.printf("%f != %f ? (%s) \n",c,d,(c!=d));
        c +=2;
        System.out.printf("%f != %f ? (%s) \n",c,d,(c!=d));

        // kurang dari
        int e,f;
        e = 11;
        f = 3;
        System.out.printf("%d < %d ? (%s) \n",e,f,(e<f));
        System.out.printf("%d < %d ? (%s) \n",f,e,(f<e));

        // lebih dari
        System.out.printf("%d > %d ? (%s) \n",e,f,(e>f));
        System.out.printf("%d > %d ? (%s) \n",f,e,(f>e));
        
    }
}

