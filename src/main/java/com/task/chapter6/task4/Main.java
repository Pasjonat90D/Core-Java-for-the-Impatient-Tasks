package com.task.chapter6.task4;

public class Main {

    public static void main(String[] args){
        Table<String,String> table = new Table<>();
        table.set("1","what");
        table.set("2", "how");
        table.set("3", "which");
        System.out.println(table.getValue("1"));
        table.setValue("2","blblbla");
        table.deleteKey("3");
        table.list.stream().forEach(stringStringEntry -> System.out.println("Key = "
                +stringStringEntry.getKey()+" Value = "+stringStringEntry.getValue()));

    }

}
