package com.task.chapter2.task17;

import java.util.Iterator;

public class Main {

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");

        queue.remove();

        Queue.Iterator iterator = queue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }



    }

}
