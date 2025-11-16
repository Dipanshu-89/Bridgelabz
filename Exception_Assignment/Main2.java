package Bridgelabz.Exception_Assignment;
public class Main2 {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String g : grades) {
            try {
                int num = Integer.parseInt(g);
                System.out.println("Valid grade: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}

