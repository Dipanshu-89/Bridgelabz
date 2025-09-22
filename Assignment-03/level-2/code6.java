import java.util.Scanner;
public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt(), heightA = sc.nextInt();
        int ageB = sc.nextInt(), heightB = sc.nextInt();
        int ageC = sc.nextInt(), heightC = sc.nextInt();
        if (ageA <= ageB && ageA <= ageC) {
            System.out.println("Youngest is Amar");
        } else if (ageB <= ageA && ageB <= ageC) {
            System.out.println("Youngest is Akbar");
        } else {
            System.out.println("Youngest is Anthony");
        }
        if (heightA >= heightB && heightA >= heightC) {
            System.out.println("Tallest is Amar");
        } else if (heightB >= heightA && heightB >= heightC) {
            System.out.println("Tallest is Akbar");
        } else {
            System.out.println("Tallest is Anthony");
        }
    }
}
