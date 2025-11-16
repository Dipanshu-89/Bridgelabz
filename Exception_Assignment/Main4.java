package Bridgelabz.Exception_Assignment;
import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int x = r.nextInt(2);

        if (x == 0) throw new OutOfStockException("Product is out of stock!");
        else throw new PaymentFailedException("Payment failed! Try another method.");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Order o = new Order();
        try {
            o.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}

