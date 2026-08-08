package com.commerce;

public class PhysicalItem extends Item {
    private double weight;
    private double shippingRate;
    //getters
    public double getWeight() {return this.weight;}
    public double getShippingRate(){return this.shippingRate;}

    //setters
    public void setWeight(double weight){
        if(weight>0) this.weight=weight;
        else throw new IllegalArgumentException("weight can't be negative or equal to 0");
    }
    public void setShippingRate(double shippingRate){this.shippingRate=shippingRate;}

    //default constructor
    public PhysicalItem(){
        super();
        this.weight=0;
        this.shippingRate=0;
    }

    //paramterized constructor
    public PhysicalItem(String name,double price,int stockQuantity,double taxRate,double weight,double shippingRate){
        super(name,price,stockQuantity,taxRate);
        setWeight((weight));
        setShippingRate(shippingRate);
    }

    //methods
    @Override
    public double shippingCost(){
        double shippingCost=super.shippingCost();
        shippingCost= weight * shippingRate;
        return shippingCost;
    }
    @Override
    public double tax(){
        double tax = (getPrice() + shippingCost()) * getTaxRate();
        return tax;
    }
    @Override
    public double totalPrice(){
        return tax() + getPrice() + shippingCost();
    }

}
