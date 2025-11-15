interface Vehicle {
    void displaySpeed();

    default void battery() {
        System.out.println("Battery info not available.");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 80km/hr"); }
    public void battery() { System.out.println("Battery: 70%"); }
}

class DemoVeh {
    public static void main(String[] args) {
        Vehicle v = new ElectricCar();
        v.displaySpeed();
        v.battery();
    }
}

