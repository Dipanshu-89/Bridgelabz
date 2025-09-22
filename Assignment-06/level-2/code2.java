import java.util.Scanner;

public class SumNaturalRecursive {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int rec = recursiveSum(n);
        int form = formulaSum(n);
        System.out.println("Recursive Sum: " + rec);
        System.out.println("Formula Sum: " + form);
        System.out.println(rec == form ? "Both results are equal" : "Results differ");
    }
}
