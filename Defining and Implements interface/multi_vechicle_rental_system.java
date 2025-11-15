interface Rental {
    void rent();
    void returnVehicle();
}

class Car implements Rental {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bike implements Rental {
    public void rent() { System.out.println("Bike rented"); }
    public void returnVehicle() { System.out.println("Bike returned"); }
}

class Demo2 {
    public static void main(String[] args) {
        Rental r = new Car();
        r.rent();
        r.returnVehicle();
    }
}

