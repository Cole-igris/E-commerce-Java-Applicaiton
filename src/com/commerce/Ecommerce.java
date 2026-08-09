package com.commerce;

public class Ecommerce {
    public static void main(String[] args){
        PhysicalItem a=new PhysicalItem("ASTROWORLD",999.99,54,0.08,2.5,5);
        System.out.println("Shipping Cost: "+a.shippingCost());
        System.out.println("tax: "+a.tax());
        System.out.println("Total Price: "+a.totalPrice());
    }

}
