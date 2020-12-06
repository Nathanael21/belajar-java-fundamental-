package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        long waktuStart,waktuFinish;

        FileInputStream inputFile = new FileInputStream("input.txt");
        System.out.println(inputFile.read());
        // menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(inputFile.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = "+ (waktuFinish - waktuStart));
        inputFile.close();

        // membaca dari memory
        FileInputStream inputFile2 = new FileInputStream("input.txt");
        BufferedInputStream buffingInput = new BufferedInputStream(inputFile2);

        buffingInput.mark(200);
        waktuStart = System.nanoTime();
        System.out.println(buffingInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));

        // baca ulang
        buffingInput.reset();
        byte[] data = buffingInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);

        // menulis dengan buffered output
        FileOutputStream output = new FileOutputStream("output.text");
        BufferedOutputStream buffingOutput = new BufferedOutputStream(output);

        //write data berupa byte
        buffingOutput.write(data,0,data.length);
        buffingOutput.flush();
        buffingInput.close();
        buffingOutput.close();


    }
}
