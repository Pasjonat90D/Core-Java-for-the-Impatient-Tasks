package com.task.chapter7.task13;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args){
        LinkedHashMap<Integer,String> map = new Cache(5);
        map.put(1,"z");
        map.put(2,"x");
        map.put(3,"c");
        map.put(4,"v");
        map.put(5,"b");
        map.put(6,"n");
        System.out.print(map.toString());


    }

}
