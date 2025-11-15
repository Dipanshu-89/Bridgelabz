interface Device {
    void turnOn();
    void turnOff();
}
class Light implements Device {
    public void turnOn() { System.out.println("Light ON"); }
    public void turnOff() { System.out.println("Light OFF"); }
}
class AC implements Device {
    public void turnOn() { System.out.println("AC ON"); }
    public void turnOff() { System.out.println("AC OFF"); }
}
class Demo1 {
    public static void main(String[] args) {
        Device d = new Light();
        d.turnOn();
        d.turnOff();
    }
}
