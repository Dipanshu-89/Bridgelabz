import java.util.*;

class PalindromeCheck {

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        if (isPalindrome(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}

