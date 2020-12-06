package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("======Bitwise======");
        // operator untuk nilai bit
         byte a = 10;
         byte b,c;
         String a_bits,b_bits,c_bits;
         a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits,a);
        System.out.println("======shift left======");
        b = (byte)(a << 2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("======shift Right======");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        System.out.println("======OR======");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);
        System.out.println("======AND======");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);
        System.out.println("======XOR======");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits,b);
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits,c);
    }
}
