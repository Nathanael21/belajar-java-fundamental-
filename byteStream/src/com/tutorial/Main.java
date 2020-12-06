package com.tutorial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInput = null;

        System.out.println("file input bernilai = " + fileInput);

        fileInput = new FileInputStream("input.txt");
        System.out.println("file input bernilai = " + fileInput);
        fileInput.close();

        fileInput = new FileInputStream("input2.txt");
        System.out.println("file input bernilai = " + fileInput);

        // Byte Stream
        // (membuka file)
        fileInput = new FileInputStream("input.txt");
        //membaca file
        int data = fileInput.read();
        while(data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        System.out.println("\n");
        // menutup file
        fileInput.close();


        // scenario membuka file
        FileOutputStream fileOutput = null;

        try {
            // membuka file
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");
            //membaca file
            int buffer = fileInput.read();
            // menulis file
            while(buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
        } finally {
            if(fileInput != null){
                fileInput.close();
            }else{
            System.err.println("no such folder found");
            }
            if(fileOutput != null){
                fileOutput.close();
            }else{
            System.err.println("no such folder found");
            }

        }

        // yang terakhir(try with resources)
        try (
                FileInputStream in = new FileInputStream("input.txt");
                FileOutputStream out = new FileOutputStream("output.txt")
        ){
            int dataBaru = in.read();
            while(dataBaru != -1){
                out.write(dataBaru);
                dataBaru = in.read();
            }
        }




    }
}
