package Bridgelabz.Generic_problems;
import java.util.*;
abstract class WarehouseItem {}
class Electronics extends WarehouseItem {}
class Groceries extends WarehouseItem {}
class Furniture extends WarehouseItem {}
class Storage<T extends WarehouseItem> {
    private List<T> list = new ArrayList<>();
    public void add(T item) { list.add(item); }
    public static void displayStorage(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items)
            System.out.println(i.getClass().getSimpleName());
    }
}

