package com.task.chapter3.task9;

public class Main {

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        int i =0;
        Runnable runnable1 = ()->System.out.println("Runable1");
        Runnable runnable2 = ()->System.out.println("Runable2");
        Runnable runnable3 = ()->System.out.println("Runable3");




        greeter.runTogether(runnable1,runnable2,runnable3);
        greeter.runInOrder(runnable1,runnable2,runnable3);

    }

}
