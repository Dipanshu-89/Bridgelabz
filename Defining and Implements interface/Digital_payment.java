interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double a) { System.out.println("Paid via UPI: " + a); }
}

class CreditCard implements Payment {
    public void pay(double a) { System.out.println("Paid via Card: " + a); }
}

class Demo3 {
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay(500);
    }
}

