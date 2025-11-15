interface PaymentProcessor {
    void pay(double amt);

    default void refund(double amt) {
        System.out.println("Refund: " + amt);
    }
}

class PayTM implements PaymentProcessor {
    public void pay(double amt) { System.out.println("Paid: " + amt); }
}

class DemoPay {
    public static void main(String[] args) {
        PayTM p = new PayTM();
        p.pay(200);
        p.refund(50);
    }
}

