import java.util.*;
class Invoice {
    int id;
    Invoice(int i) {
        id = i;
    }
}
class InvoiceDemo {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(10, 20, 30);
        List<Invoice> invoices =
                ids.stream()
                   .map(Invoice::new)
                   .toList();
        for (Invoice i : invoices) {
            System.out.println("Invoice ID: " + i.id);
        }
    }
}
