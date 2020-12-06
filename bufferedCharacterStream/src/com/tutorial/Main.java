package com.tutorial;
import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {

    // read file
        FileReader input = new FileReader("input.txt");
        BufferedReader inputBuff = new BufferedReader(input);

        inputBuff.mark(200);
        System.out.println(inputBuff.readLine());
        inputBuff.reset();

        // membaca dalam char
        char[] dataChar = new char[25];
        inputBuff.read(dataChar,0,25);
        System.out.println(Arrays.toString(dataChar));
        inputBuff.reset();

        // membaca baris
        System.out.println(inputBuff.readLine());
        System.out.println(inputBuff.readLine());
        inputBuff.reset();

        //menulis
        FileWriter output = new FileWriter("output.txt");
        BufferedWriter outputBuff = new BufferedWriter(output);

        String barisSatu = inputBuff.readLine();
        outputBuff.write(barisSatu,0,barisSatu.length());
        outputBuff.flush();

        //baris 2 (menambah new line atau enter)
        outputBuff.newLine();
        String barisDua = inputBuff.readLine();
        outputBuff.write(barisDua,0,barisDua.length());
        outputBuff.flush();

        input.close();
        inputBuff.close();
        output.close();
        outputBuff.close();

    }
}
