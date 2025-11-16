package Bridgelabz.Wrapper_class;
import java.util.*;
class Q7 {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        for (double p : prices) {
            list.add(p); 
        }
        double max = Collections.max(list);
        double total = 0;
        for (double x : list) {
            total += x;
        }
        double avg = total / list.size();
        System.out.println("Highest: " + max);
        System.out.println("Average: " + avg);
    }
}

