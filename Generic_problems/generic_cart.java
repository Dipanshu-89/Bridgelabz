package Bridgelabz.Generic_problems;
import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }

    public void displayItems() {
        for (T i : items) System.out.println(i);
    }

    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");

        Cart<String> clothingCart = new Cart<>();
        clothingCart.addItem("Shirt");

        electronicsCart.displayItems();
        clothingCart.displayItems();
    }
}

