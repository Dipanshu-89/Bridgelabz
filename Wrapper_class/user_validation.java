package Bridgelabz.Wrapper_class;
class Q11 {
    public static boolean checkAge(String age) {
        try {
            int n = Integer.parseInt(age);
            return n >= 18;
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkAge("20"));
        System.out.println(checkAge("abc"));
        System.out.println(checkAge("15"));
    }
}

