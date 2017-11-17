package com.task.chapter3.task9;

public class Greeter  {


    public static void runTogether(Runnable... tasks){
        int i=0;
        for(Runnable task : tasks){
            new Thread(task).run();
        }
    }
    public static void runInOrder(Runnable... tasks){
        for(Runnable task : tasks){
            task.run();
        }
    }

}
