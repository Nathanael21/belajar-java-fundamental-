package com.tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a = 0;
        String y;
        while(true){
            System.out.println("a = " + a);
            a++;
            System.out.println("again?(y/n)");
            Scanner User = new Scanner(System.in);
            y = User.next();
            if (y.equals("n") || y.equals("N")){
                break;
            }else{
                continue;
                // dan return untuk finish program
                
            }

        }
    }
}
