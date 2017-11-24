package com.task.chapter6.task2;


public class Main {

    public static void main(String[] args){
        Stack<String> stack =  new Stack<>(String.class);
        stack.push("what");
        System.out.println(stack.toString());
        String s = stack.pop();
        System.out.println(s);
        System.out.println(stack.isEmpty());
    }

}
