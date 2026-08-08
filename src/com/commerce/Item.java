package com.commerce;

public class Item {
    private String name;
    private double price;
    private int stockQuantity;
    //default constructor
    public Item(){
        this.name="unknown";
        this.price=0.0;
        this.stockQuantity=0;
    }
    //parameterized const
    public Item(String name,double price,int stockQuantity){
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
    }//this approach ensures we keep the controlled validation logic of the setter
    //getters
    public String getName(){return this.name;}
    public double getPrice(){return  this.price;}
    public int getStockQuantity(){return this.stockQuantity;}
    //setters
    public void setName(String name){this.name=name;}
    public void setPrice(double price) {
        if (price > 0) this.price = price;
        else throw new IllegalArgumentException("price can't ne negative");
    }
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity > 0) this.stockQuantity = stockQuantity;
        else throw new IllegalArgumentException("stock quantity can't be initially 0");
    }
    public void display(){
        System.out.println("p");
    }
    public double tax(){
        System.out.print("p");
        return 5.2;
    }
    public double totalPrice(){
        System.out.print("p");
        return 65.12;
    }

}
