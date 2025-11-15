interface SecurityUtils {
    static boolean isStrong(String p) {
        return p.length() >= 8;
    }
}
class TestPass {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("abc12345"));
    }
}

