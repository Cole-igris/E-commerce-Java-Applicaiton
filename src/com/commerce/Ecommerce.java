package com.commerce;
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Item a = null;
        Scanner input = new Scanner(System.in);
        int choice, addToCart;
        displayMenu();
        choice = input.nextInt();
        switch (choice) {
            case 1:
                a = new PhysicalItem("laptop", 999.99, 22, 0.08, 2.5, 5);
                break;
            case 2:
                a = new DigitalItem("E-bookJavaBasics", 29.99, 5, 0.08, 0.5);
                break;
            case 3:
                a = new PhysicalItem("Monitor", 129.99, 14, 0.08, 3, 5);
                break;
            case 4:
                a = new DigitalItem("javatutorial", 19.99, 3, 0.08, 220.5);
        }
        productDetail(a);
    }
    public static void displayMenu(){
        System.out.print("Products Browsing\n");
        System.out.print("1. [physical] Laptop\n");
        System.out.print("2. [digital] E-book Java\n");
        System.out.print("3. [physical] Monitor\n");
        System.out.print("4. [digital] Java tutorial\n");
        System.out.print("Your choice: ");
    }
    public static void productDetail(Item item){
        System.out.println(item.getName()+" Details");
        System.out.println("Type: "+ item.getType());
        System.out.println("Price: "+ item.getPrice());
        System.out.println("Shipping Cost: "+ item.shippingCost());
        System.out.println("Tax: "+ item.tax());
        System.out.println("Download link: "+ item.link());
        System.out.println("Total price: "+item.totalPrice());
        System.out.print("Add to Cart: ");
    }


}
