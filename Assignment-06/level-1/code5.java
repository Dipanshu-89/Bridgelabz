import java.util.Scanner;

public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "Its a Spring Season" : "Not a Spring Season");
    }
}

