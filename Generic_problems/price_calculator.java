package Bridgelabz.Generic_problems;
import java.util.*;

class Product {
    double price;
    Product(double price) { this.price = price; }
    double getPrice() { return price; }
}

class Mobile extends Product {
    Mobile(double p) { super(p); }
}

class Laptop extends Product {
    Laptop(double p) { super(p); }
}

class PriceCalc {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> m = List.of(new Mobile(10000), new Mobile(12000));
        System.out.println(calculateTotal(m));
    }
}

