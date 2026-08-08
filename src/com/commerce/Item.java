package com.commerce;

public class Item {
    private String name;
    private double price;
    private int stockQuantity;
    private double taxRate;
    //private double shippingRate;
    //default constructor
    public Item(){
        this.name="unknown";
        this.price=0.0;
        this.stockQuantity=0;
        this.taxRate=0.0;
        //this.shippingRate=0.0;
    }
    //parameterized const
    public Item(String name,double price,int stockQuantity, double taxRate){
        setName(name);
        setPrice(price);
        setStockQuantity(stockQuantity);
        setTaxRate(taxRate);
    }//this approach ensures we keep the controlled validation logic of the setter
    //getters
    public String getName(){return this.name;}
    public double getPrice(){return  this.price;}
    public int getStockQuantity(){return this.stockQuantity;}
    public double getTaxRate(){return this.taxRate;}
    //public double getShippingRate(){return this.shippingRate;}

    //setters
    public void setName(String name){this.name=name;}
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else throw new IllegalArgumentException("price can't ne negative");
    }
    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) this.stockQuantity = stockQuantity;
        else throw new IllegalArgumentException("stock quantity can't be initially 0 or negative");
    }
    public void setTaxRate(double taxRate) {
        if (taxRate >= 0) this.taxRate = taxRate;
        else throw new IllegalArgumentException("Tax Rate can't be initially 0 or negative");
    }

    //methods
    public void display(){
        System.out.println("p");
    }
    public double tax(){
        return 0;
    }
    public double shippingCost(){return 0;}
    public double totalPrice(){
        return 0.0;
    }
    /*price,tax, and shipping functions will never be used by the item(parent) class but to allow polymorphism
    these methods must exist first in the parents class then override in child ones*/

}
