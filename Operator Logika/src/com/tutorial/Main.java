package com.tutorial;

public class Main {
    public static void main(String[] args){
        System.out.println("======Operator Logika======");
        // operasi yang bisa kita lakukan terhadap boolean
        // AND, OR, XOR,!(negasi)
        boolean a,b,c;
        // OR (||)
        System.out.println("======OR======");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        System.out.println("======AND======");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        System.out.println("=======XOR======");
        // XOR (^)
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("======NOT(Negasi => !)======");
        // negasi (NOT)
        a = true;
        System.out.println("nilai a = " + a);
        c = !a;
        System.out.println("nilai a menjadi " + c);
        b = false;
        System.out.println("nilai b = "  + b);
        c = !b;
        System.out.println("nilai b menjadi " + c);
    }
}
