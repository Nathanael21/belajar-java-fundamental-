package com.tutorial;

public class Main {
    public static void main(String[] args){

        // variable
        int b = 10;
        int a = 11;
        int c = a+b;
        System.out.println(c);

        c = 22;
        System.out.println(c);

        // deklarasi atau type data dari sebuah variable

        int d = 7; // deklarasi
        System.out.println("nilai b = " + d);

        // type data (digunakan dalam deklarasi pada variable)
        System.out.println("======type data======");
        System.out.println("integer,byte,short,long,double,float,char,boolean");
        System.out.println("======Example======");
        System.out.println("======Integer======");
        // integer  (int)
        int i = 10;
        System.out.println("nilai dari i = " + i);
        System.out.println("Nilai Max Integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai Min Integer = " + Integer.MIN_VALUE);
        System.out.println("kalau integer melebihi batas max integer =====");
        int max = 2147483647;
        System.out.println("Nilai max = " + (max + 1));
        System.out.println("akan memutar balik ke minus");
        System.out.println("Integer dalam Byte = " + Integer.BYTES + "bytes");
        System.out.println("Integer dalam Bit = " + Integer.SIZE + "bit");
        System.out.println("======END Integer======");

        System.out.println("======Byte======");
        // Byte  (byte)
        byte y = 10;
        System.out.println("nilai dari y = " + y);
        System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Min Byte = " + Byte.MIN_VALUE);
        System.out.println("Byte dalam Byte = " + Byte.BYTES + "bytes");
        System.out.println("Byte dalam Bit = " + Byte.SIZE + "bit");
        System.out.println("======END Byte======");
        System.out.println("======Short======");
        // Short  (short)
        short s = 10;
        System.out.println("nilai dari s = " + s);
        System.out.println("Nilai Max Short = " + Short.MAX_VALUE);
        System.out.println("Nilai Min Short = " + Short.MIN_VALUE);
        System.out.println("Short dalam Byte = " + Short.BYTES + "bytes");
        System.out.println("Short dalam Bit = " + Short.SIZE + "bit");
        System.out.println("======END Short======");
        System.out.println("======Long======");
        // Long  (long)
        long l = 10;
        System.out.println("nilai dari l = " + l);
        System.out.println("Nilai Max Long = " + Long.MAX_VALUE);
        System.out.println("Nilai Min Long = " + Long.MIN_VALUE);
        System.out.println("Long dalam Byte = " + Long.BYTES + "bytes");
        System.out.println("Long dalam Bit = " + Long.SIZE + "bit");
        System.out.println("======END Long======");
        System.out.println("======Double======");
        // Double  (double)
        double o = -10.1d;
        System.out.println("nilai dari o = " + o);
        System.out.println("Nilai Max double = " + Double.MAX_VALUE);
        System.out.println("Nilai Min double = " + Double.MIN_VALUE);
        System.out.println("double dalam Byte = " + Double.BYTES + "bytes");
        System.out.println("double dalam Bit = " + Double.SIZE + "bit");
        System.out.println("======END Double======");
        System.out.println("======Float======");
        // Float  (float)
        float f = -10.81f;
        System.out.println("nilai dari f = " + f);
        System.out.println("Nilai Max Float = " + Float.MAX_VALUE);
        System.out.println("Nilai Min Float = " + Float.MIN_VALUE);
        System.out.println("Float dalam Byte = " + Float.BYTES + "bytes");
        System.out.println("Float dalam Bit = " + Float.SIZE + "bit");
        System.out.println("======END Float======");
        System.out.println("======Char======");
        // Char  (Character)
        char h = 'w';
        System.out.println("nilai dari h = " + h);
        System.out.println("Nilai Max Char = " + Character.MAX_VALUE);
        System.out.println("Nilai Min Char = " + Character.MIN_VALUE);
        System.out.println("Character dalam Byte = " + Character.BYTES + "bytes");
        System.out.println("Character dalam Bit = " + Character.SIZE + "bit");
        System.out.println("======END Character======");
        

    }
}
