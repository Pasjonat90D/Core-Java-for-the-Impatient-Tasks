package com.task.chapter3.task8;

public class Main {

    public static void main(String[] args){
        Greeter greeter1 = new Greeter("Name1",1000);
        Greeter greeter2 = new Greeter("Name2",1000);

        Thread thread1 = new Thread(greeter1);
        Thread thread2 = new Thread(greeter2);

        thread1.run();
        thread2.run();


    }

}
