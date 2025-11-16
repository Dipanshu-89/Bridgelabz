package Bridgelabz.Wrapper_class;
class Q15 {
    public static void log(double d) {
        System.out.println("Primitive: " + d);
    }
    public static void log(Double d) {
        System.out.println("Wrapper: " + d);
    }
    public static void main(String[] args) {
        double a = 32.5;
        Double b = 40.8;
        log(a);  
        log(b);  
    }
}

