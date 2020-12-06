package com.tutorial;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream("outputByte.txt");
        FileOutputStream output = new FileOutputStream("baru.txt");
        FileReader in = new FileReader("outputByte.txt");
        FileWriter out = new FileWriter("outputts.txt");

        int buffer = in.read();

        while(buffer != -1){
            out.write(buffer);
            buffer = in.read();
        }

        buffer = input.read();

        while(buffer != -1){
            output.write(buffer);
            buffer = input.read();
        }


        in.close();
        out.close();
        input.close();
        output.close();

    }
}
