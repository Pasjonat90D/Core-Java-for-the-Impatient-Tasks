package com.task.chapter7.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("what");
        list.add("how");
        list.add("asdmxzclsd=");
        Iterator<String> iterator1 = list.iterator();
        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext()){
            while (iterator2.hasNext()){
                //error
//               list.remove(iterator2.next());
                    //solution: If you use two iterators, they can not modify the collection.
            }
            iterator1.next();
        }
    }


    }
