package com.task.chapter7.task10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //toDO
    public static void main(String[] args){
        Map<String, Set<Neighbor>> mapCitys = createMapCities();
        //1 to 5


    }


    public static  Map<String, Set<Neighbor>> createMapCities(){
        Map<String, Set<Neighbor>> citys = new HashMap<>();

        Set<Neighbor> neighbors1 = new HashSet<>();
        neighbors1.add(new Neighbor("6",14));
        neighbors1.add(new Neighbor("3",9));
        neighbors1.add(new Neighbor("2",7));
        citys.put("1",neighbors1);

        Set<Neighbor> neighbors2 = new HashSet<>();
        neighbors2.add(new Neighbor("1",7));
        neighbors2.add(new Neighbor("3",10));
        neighbors2.add(new Neighbor("4",15));
        citys.put("2",neighbors2);

        Set<Neighbor> neighbors3 = new HashSet<>();
        neighbors3.add(new Neighbor("1",9));
        neighbors3.add(new Neighbor("2",10));
        neighbors3.add(new Neighbor("4",11));
        neighbors3.add(new Neighbor("6",2));
        citys.put("3",neighbors3);

        Set<Neighbor> neighbors4 = new HashSet<>();
        neighbors4.add(new Neighbor("2",15));
        neighbors4.add(new Neighbor("3",11));
        neighbors4.add(new Neighbor("5",6));
        citys.put("4",neighbors4);

        Set<Neighbor> neighbors5 = new HashSet<>();
        neighbors5.add(new Neighbor("4",6));
        neighbors5.add(new Neighbor("6",9));
        citys.put("5",neighbors5);

        Set<Neighbor> neighbors6 = new HashSet<>();
        neighbors6.add(new Neighbor("1",14));
        neighbors6.add(new Neighbor("3",2));
        neighbors6.add(new Neighbor("5",9));
        citys.put("6",neighbors6);

        return citys;
    }

}
