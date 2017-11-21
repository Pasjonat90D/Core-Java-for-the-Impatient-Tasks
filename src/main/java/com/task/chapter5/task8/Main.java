package com.task.chapter5.task8;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        try(AutoCloseable close = helpReentrantLock(new ReentrantLock()) ){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static AutoCloseable helpReentrantLock(ReentrantLock reentrantLock){
        reentrantLock.lock();
       return () -> reentrantLock.unlock();
    }

}
