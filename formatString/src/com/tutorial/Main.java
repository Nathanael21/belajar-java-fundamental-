package com.tutorial;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String nama = "udin";
        int umur = 17;

        //ouput : Nama saya adalah udin dan umur saya adalah 17
        // (yang biasa)
        System.out.println("Nama saya adalah " + nama + " dan umur saya adalah " + umur);
        //cara lain dengan format string
        System.out.printf("Nama saya adalah %s dan umur saya adalah %d \n",nama,umur);

        /*
        * conversion  format string:
        * %f : Floating point (include double)
        * %d : Integer
        * %s : String
        * %c : Char
        * %b : Boolean
        * */

        // struktur format (%[argumentIndex][flags][width][.precision] conversion)
        System.out.println("\n====[argumentIndex]");
        //output : udin, wahai udin, kemana saja kamu udin
        System.out.printf("%s, wahai %s, kemana saja kamu %s \n",nama,nama,nama);
        //simplenya menjadi
        System.out.printf("(versi mudahnya) %1$s, wahai %1$s, kemana saja kamu %1$s\n",nama);
        //output : umur udin berapa?, udin menjawab 17, wah masih muda ya umurnya 17
        System.out.printf("umur %1$s berapa?, %1$s menjawab %2$d\nwah masih muda ya umurnya %2$d \n",nama,umur);

        //flags
        System.out.println("\n===[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 + int2;
        System.out.println("+"+int1);
        //untuk mengatasi ambiguitas terhadap nilai nilai
        System.out.printf("%d + %d = %d\n",int1,int2,hasil);
        //contoh flags +
        System.out.printf("%d + %d = %+d\n",int1,int2,hasil);

        //[width]
        System.out.println("\n====[width]");
        int int3 = 1000;
        System.out.println("Integer");
        System.out.printf("%d\n",int3);
        System.out.println("pemberian width");
        System.out.printf("%5d\n",int3);//pemberian slot terhadap angka
        System.out.printf("%-5d\n",int3);//menggunakan flags = "-",artinya rata kiri
        System.out.printf("%+5d\n",int3);// flags akan akan mengambil slot di dalam format
        System.out.printf("%+-6d\n",int3);//flags bisa digabungkan
        System.out.printf("%010d\n",int3);//flags = 0 menganti space kosong dengan 0
        System.out.printf("%+010d\n",int3);
        System.out.printf("%,10d\n",int3);//menambah kan , setiap 1000 atau dinmakan delimeter
        int int4 = 1000000000;
        System.out.printf("%-,15d\n",int4);

        System.out.println("\n====FLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n",float1);//floating sudah mengambil 6 width
        System.out.printf("%-9f\n",float1);//akan menambah 1 space rata kiri(space menjadi berada di kanan)
        System.out.printf("%+9f\n",float1);//space di kanan menjadi "+"

        //[.precision]
        System.out.println("\n====[.precision]");

        float float2 = 15.678f;
        System.out.printf("%f\n",float2);//sudah ada 6 di belakang koma
        //untuk menghilankannya menggunakan tanda "."
        System.out.printf("%.1f\n",float2);
        /*
        * untuk menggunakan .[precision] maka angka yang kita ambiil bila
        * diatas 5 maaka akan dibulatkan bila di bawah maka tidak akan
        * dibulatkan
        * */
        System.out.printf("%.2f\n",float2);

        //menggabungkan dengan width
        System.out.printf("%-+8.1f\n",float2);//nahh menambahkan width di sebelah kanan
        System.out.printf("%+08.1f\n",float2);//menambahkan leading 0


        /*
        * Contoh
        * struktur format (%[argumentIndex][flags][width][.precision] conversion)
        * */

        System.out.println("\n ====Contoh");
        nama = "Ucup";
        float IPK = 3.78512312311357f;
        System.out.printf("IPK %1$s berapa sih %1$s?\n",nama);
        System.out.printf("IPK %s itu segini tante = %+5.2f\n",nama,IPK);

        /*
        * Kesimpulan
        * kita dapat menyimpan format ke dalam format string
        * */

        System.out.println("menggunakan format biasa abal abal");
        String infoBiasa = "nama : " + nama + "\n IPK : " + IPK;//tidak ada format atau mengambil 6 width
        System.out.println(infoBiasa);

        System.out.println("menggunakan format mantulll");
        String infoFormat = String.format("nama : %s \n IPK : %+5.2f",nama,IPK);
        System.out.println(infoFormat);

        // menggunakan StringBuilder
        System.out.println("\n\nMenggunakan String builder bersama format");
        StringBuilder builderInfo = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderInfo);
        formatBuilder.format("nama : %s \n IPK : %+5.2f",nama,IPK);
        System.out.println(builderInfo);

    }
}
