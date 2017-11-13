package com.task.chapter2.task15;

public class Main {
    public static void main(String[] args) {
        String description = "";
        int quantity = 1;
         double unitPrice = 100;
         System.out.println("Creating invoices:");
        Invoice invoices = new Invoice();
        for(int i=0;i<5;i++,quantity++,unitPrice++) {
            System.out.println(i + " Invoice : Description = " + (description = String.valueOf(i)) +
                    "| quantity = " + quantity + "| unit price = " + unitPrice);
            Invoice.Item invoice = new Invoice.Item(description, quantity, unitPrice);
            invoices.add(invoice);
        }
        System.out.println("Printing invoices:");
        invoices.print();
    }



}
