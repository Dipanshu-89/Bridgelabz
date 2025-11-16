package Bridgelabz.Exception_Assignment;
import java.util.Random;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) { super(msg); }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) { super(msg); }
}

class Transaction {
    private int balance = 5000;

    public void process(int amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        Random r = new Random();
        int x = r.nextInt(3);

        if (amount < 0)
            throw new NegativeAmountException("Amount cannot be negative!");

        if (amount > balance)
            throw new InsufficientFundsException("Not enough balance!");

        if (x == 1)
            throw new NetworkFailureException("Network Failure! Try again.");

        balance -= amount;
        System.out.println("Transaction successful! Remaining balance: " + balance);
    }
}
public class Main5 {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.process(6000);
        } catch (NegativeAmountException | InsufficientFundsException | NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}

