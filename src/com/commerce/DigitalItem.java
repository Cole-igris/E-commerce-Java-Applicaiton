package com.commerce;

public class DigitalItem extends Item {
    private double fileSize;

    //parameterized const
    public DigitalItem(String name,double price,int stockQuantity, double taxRate, double filesize){
        super(name, price, stockQuantity,taxRate);
        this.fileSize=filesize;
    }

    //default
    public DigitalItem(){
        super();
        this.fileSize=0.0;
    }

    //getters
    public double getFileSize(){return this.fileSize;}

    //setters
    public void setFileSize(double fileSize) {this.fileSize = fileSize;}

    //methods
    @Override
    public double tax(){
        double tax=this.getPrice() * this.getTaxRate();
        return tax;
    }
    @Override
    public double shippingCost(){
        return super.shippingCost();
    }
    @Override
    public double totalPrice(){
        double totalPrice=super.totalPrice();
        totalPrice=getPrice() + tax();
        return totalPrice;
    }
    @Override
    public String link(){
        String link=super.link();
        link="https://"+getName()+".lynstack:445";
        return link;
    }
}
