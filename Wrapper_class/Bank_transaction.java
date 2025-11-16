package Bridgelabz.Wrapper_class;
class Q14 {
    public static double getLimit(Double limit) {
        if (limit == null) return 0.0;
        return limit; 
    }
    public static void main(String[] args) {
        System.out.println(getLimit(5000.0));
        System.out.println(getLimit(null));
    }
}
