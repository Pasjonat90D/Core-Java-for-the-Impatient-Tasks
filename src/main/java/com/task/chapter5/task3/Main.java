package com.task.chapter5.task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Reading reading = new Reading();
        try {
            reading.sumOfValues("cos");
        } catch (IOException e) {
            System.out.println("File isn't exist");
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            System.out.println("I isn't reading file");
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("This isn't double");
            e.printStackTrace();
        }
    }
}
