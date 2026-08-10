package com.commerce;

public class PhysicalItem extends Item {
    private double shippingRate;
    //getters

    public double getShippingRate(){return this.shippingRate;}

    //setters

    public void setShippingRate(double shippingRate){this.shippingRate=shippingRate;}
    //default constructor
    public PhysicalItem(){
        super();
        this.shippingRate=0;
    }

    //paramterized constructor
    public PhysicalItem(String name,double price,int stockQuantity,double taxRate,double size,double shippingRate){
        super(name,price,stockQuantity,taxRate,size);
        setType("Physical");
        setShippingRate(shippingRate);
    }

    //methods
    @Override
    public double shippingCost(){
        double shippingCost=super.shippingCost();
        shippingCost= getSize() * shippingRate;
        return shippingCost;
    }
    @Override
    public double tax(){
        double tax = (getPrice() + shippingCost()) * getTaxRate();
        return tax;
    }
    @Override
    public double totalPrice(){
        double totalPrice = getPrice() + shippingCost() + tax();
        return totalPrice;
    }
}
