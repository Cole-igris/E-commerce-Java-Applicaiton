package com.commerce;

public class Ecommerce {
    public static void main(String[] args){
        Item a=new Item("Laptop",-999.99,54);
        double b= a.getPrice();
        System.out.print(b);
    }

}
