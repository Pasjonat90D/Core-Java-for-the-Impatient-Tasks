package com.task.chapter4.task6;

public class Main {

    public static void main(String[] args){
        DiscountedItem discountedItemX = new DiscountedItem("X",1,0);
        DiscountedItem discountedItemY = new DiscountedItem("X",1,1);

        Item item = new Item("X",1);

        System.out.println(discountedItemX.equals(discountedItemY));
        System.out.println(discountedItemY.equals(item));
        System.out.println(discountedItemX.equals(item));



    }
}
