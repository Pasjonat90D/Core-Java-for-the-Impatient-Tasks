package com.task.chapter9.task5;

import java.nio.charset.StandardCharsets;


public class Main {

    public static void main(String[] args) {
        byte[] biteUTF_8 = StandardCharsets.UTF_8.newEncoder().replacement();
        byte[] biteISO_8859_1 = StandardCharsets.ISO_8859_1.newEncoder().replacement();
        byte[] biteUS_ASCII = StandardCharsets.US_ASCII.newEncoder().replacement();
        byte[] biteUTF_16 = StandardCharsets.UTF_16.newEncoder().replacement();
        byte[] biteUTF_16BE = StandardCharsets.UTF_16BE.newEncoder().replacement();
        byte[] biteUTF_16LE = StandardCharsets.UTF_16LE.newEncoder().replacement();
        printByte(biteUTF_8);
        printByte(biteISO_8859_1);
        printByte(biteUS_ASCII);
        printByte(biteUTF_16);
        printByte(biteUTF_16BE);
        printByte(biteUTF_16LE);

    }

    private static void printByte(byte[] bites) {
        for (byte b : bites) {
            System.out.println((char) b);
        }
    }

}
