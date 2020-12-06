package com.tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,4,5},{6,7,8,9,10}
        };
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        char[] cha1 = {'A','B','C','D'};
        char[] cha2 = {'a','b'};
        char[][] cha2D = {
                cha1,cha2
        };

        System.out.println(Integer.toHexString(System.identityHashCode(cha2D)));
        System.out.println(Integer.toHexString(System.identityHashCode(Arrays.toString(cha2D))));

    }
}
