package com.task.chapter6.task1;

public class Main {

    public static void main(String[] args){
        Stack<String> stack =  new Stack<>();
        stack.push("what");
        System.out.println(stack);
        String s = stack.pop();
        System.out.println(s);
        System.out.println(stack.isEmpty());
    }

}
