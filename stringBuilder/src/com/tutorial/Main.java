package com.tutorial;
import java.lang.StringBuilder;
public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        //operasi yang ada pada Builder

        //append
        System.out.println("====Append");
        builder.append(" udin");
        printData(builder);
        System.out.println("<<<<");
        builder.append(" goblog");
        printData(builder);

        // insert
        System.out.println("====Insert");
        builder.insert(10,"belegug siah ");
        printData(builder);

        // delete
        System.out.println("====Delete");
        builder.delete(18,23);
        printData(builder);

        //rubah char pada indeks tertentu
        System.out.println("====Change Char costum indeks");
        builder.setCharAt(0,'H');
        printData(builder);

        // replace
        System.out.println("====replace");
        builder.replace(18,24,"tolol");
        printData(builder);

        // reverse
        System.out.println("====reverse");
        builder.reverse();
        printData(builder);

        //mengubah stringBuilder menjadi String
        System.out.println("====Merubah stringBuilder menjadi string");
        String kalimatBuilder = builder.toString();
        int addressKalimat = System.identityHashCode(kalimatBuilder);
        System.out.println("address = " + Integer.toHexString(addressKalimat));
    }

    public static void printData(StringBuilder builder){
        System.out.println("data = " + builder);
        System.out.println("data capacity = " + builder.capacity());
        System.out.println("panjang = " + builder.length());
        int addressBuilder = System.identityHashCode(builder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

}
