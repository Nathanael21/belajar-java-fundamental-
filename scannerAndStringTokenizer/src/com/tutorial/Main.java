package com.tutorial;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("input.txt");
        BufferedReader inputBuff = new BufferedReader(input);

        Scanner scan = new Scanner(inputBuff);

        /*
        * cara ngechek apakah ada kata selanjutnya atau tidak
        * scan.hasNext();
        * */

        System.out.println(scan.hasNext()); // true
        // membaca kata dengan delimeter spasi atau pemisah spasi
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.next());
        System.out.println(scan.hasNext()); // false
        System.out.println("====");
        // membaca string dengan delimiter bebas
        FileReader input2 = new FileReader("input2.txt");
        BufferedReader input2Buff = new BufferedReader(input2);
        input2Buff.mark(200);
        scan = new Scanner(input2Buff);
        scan.useDelimiter(",");
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        input2Buff.reset();
        System.out.println("=====");
        //Tokenizer mengambil hanya sebaris
        String data = input2Buff.readLine();
        // string tokenizer
        StringTokenizer token = new StringTokenizer(data,",");
        while(token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }

    }
}
