package com.task.chapter2.task15;

import java.util.ArrayList;

public class Invoice {
    public static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }
    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item(description,quantity,unitPrice);
        items.add(newItem);
    }
    public void print(){
        for(Item item : items){
            System.out.println("Description " + item.description+", unit price "+item.unitPrice + ", quantity "+item.quantity );
        }
    }
}