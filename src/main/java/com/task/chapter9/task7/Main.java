package com.task.chapter9.task7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\src\\main\\java\\com\\task\\chapter9\\task7" +
                "\\file\\sh_1.txt";
        try {
            System.out.println(sha_1(fileString));
        } catch (DigestException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String sha_1(String filePath) throws DigestException, NoSuchAlgorithmException, IOException {
        File file = new File(filePath);
        MessageDigest md = MessageDigest.getInstance("SHA-1");

        FileInputStream fileStream = new FileInputStream(filePath);
        byte[] data = new byte[1024];
        int read = 0;
        while ((read = fileStream.read()) != -1) {
            md.update(data, 0, read);
        }
        byte[] hashByte = md.digest();
        String hashByteString = "";
        for (byte b : hashByte) {
            hashByteString = hashByteString + b;
        }
        return hashByteString;
    }

}
