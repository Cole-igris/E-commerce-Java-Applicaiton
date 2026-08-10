package com.commerce;

public class DigitalItem extends Item {
    private String link;

    //parameterized const
    public DigitalItem(String name,double price,int stockQuantity, double taxRate,double size){
        super(name, price, stockQuantity,taxRate,size);
        setType("Digital");
    }

    //default
    public DigitalItem(){
        super();
        this.link="none";
    }

    //getters
    public String getLink(){return this.link;}

    //setters
    public void setLink(String link) {this.link = link;}

    //methods
    @Override
    public double tax(){//super is used to extend the behavior of the parent class not to enable polymorphism
        double tax=this.getPrice() * this.getTaxRate();
        return tax;
    }
    @Override
    public double shippingCost(){
        return super.shippingCost();
    }
    @Override
    public double totalPrice(){
        double totalPrice=getPrice() + tax();
        return totalPrice;
    }
    @Override
    public String link(){
        String link="https://"+getName()+"lynstack.org:445";
        return link;
    }
}
