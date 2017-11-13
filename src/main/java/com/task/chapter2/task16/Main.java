package com.task.chapter2.task16;

public class Main {

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");

        queue.remove();

        System.out.print(queue);

    }

}
