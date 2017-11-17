package com.task.chapter3.task8;

public class Greeter implements Runnable {

    private String target;
    private int n;

    public Greeter(String target,int n){
        this.target = target;
        this.n = n;
    }

    @Override
    public void run() {
        for(int i =0;i<n;i++){
            System.out.println("Witaj," +target);
        }
    }
}
