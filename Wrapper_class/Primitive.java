package Bridgelabz.Wrapper_class;
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        Integer obj = Integer.valueOf(n);

        System.out.println("Primitive: " + n);
        System.out.println("Wrapper: " + obj);
        sc.close();
    }
}

