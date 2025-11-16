package Bridgelabz.Wrapper_class;
import java.util.*;
class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String s = sc.nextLine();
        int letters = 0, digits = 0, special = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch))
                letters++;
            else if (Character.isDigit(ch))
                digits++;
            else if (!Character.isWhitespace(ch))
                special++;
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
        sc.close();
    }
}

