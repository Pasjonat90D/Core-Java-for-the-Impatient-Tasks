package com.task.chapter9.task6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task6" +
                "\\images\\image.bmp";

        try (RandomAccessFile file = new RandomAccessFile(fileString, "rw")) {
            byte[] tab = new byte[Math.toIntExact(file.length())];
            for (int i = 0; i < file.length(); i++) {
                tab[i] = file.readByte();
                System.out.println(tab[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
