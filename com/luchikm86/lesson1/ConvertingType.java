package com.luchikm86.lesson1;

public class ConvertingType {

    public static void main(String[] args) {
        byte b1 = 10;
        short s1 = b1;
        System.out.println("s1 = " + s1);

        System.out.println();

        byte b2 = 127;
        long l1 = b2;
        System.out.println("l1 = " + 1l);
        System.out.println();

        byte q;
        long a = 400;
        q = (byte) a;
        System.out.println("q = " + q);

        System.out.println();

        double d = 56.9898;
        int c = (int)d;
        System.out.println(c);
        int c1 = (int)Math.round(d);
        System.out.println(c1);

    }

}
