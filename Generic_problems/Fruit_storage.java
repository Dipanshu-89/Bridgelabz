package Bridgelabz.Generic_problems;
class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}  
class FruitBox<T extends Fruit> {
    private java.util.List<T> list = new java.util.ArrayList<>();
    public void add(T fruit) {
        list.add(fruit);
    }
    public void display() {
        for (T f : list) System.out.println(f.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Apple());
        box.display();
    }
}

