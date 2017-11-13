package com.task.chapter1.task10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;

public class Main {

    private static Map<Integer,String> system36 = creatMap();



    public static void main(String[] args) {
        for(int i = 0 ;i<50;i++) {
            Random rand = new Random();
            long lon = rand.nextLong();
            String result;
            if (lon < 0) {
                result = "-";
            } else {
                result = "";
            }
            lon = Math.abs(lon);
            do {
                result = result + whatChar((int) (lon % 36));
                lon = lon / 36;
            } while (lon > 0);

            System.out.println(result);
        }
    }

    public static String whatChar(int lon){
        return system36.get(lon);
    }


    private static Map<Integer,String> creatMap() {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        map.put(5,"5");
        map.put(6,"6");
        map.put(7,"7");
        map.put(8,"8");
        map.put(9,"9");
        map.put(10,"A");
        map.put(11,"B");
        map.put(12,"C");
        map.put(13,"D");
        map.put(14,"E");
        map.put(15,"F");
        map.put(16,"G");
        map.put(17,"H");
        map.put(18,"I");
        map.put(19,"J");
        map.put(20,"K");
        map.put(21,"L");
        map.put(22,"M");
        map.put(23,"N");
        map.put(24,"O");
        map.put(25,"P");
        map.put(26,"Q");
        map.put(27,"R");
        map.put(28,"S");
        map.put(29,"T");
        map.put(30,"U");
        map.put(31,"V");
        map.put(32,"W");
        map.put(33,"X");
        map.put(34,"Y");
        map.put(35,"Z");
        return map;
    }

}
