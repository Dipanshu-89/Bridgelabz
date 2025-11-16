package Bridgelabz.Exception_Assignment;
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}
class Login {
    private String validUser = "admin";
    private String validPass = "12345";

    public void validate(String u, String p) throws InvalidCredentialsException {
        if (!u.equals(validUser) || !p.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
    }
}
public class Main3 {
    public static void main(String[] args) {
        Login login = new Login();

        try {
            login.validate("admin", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Try again!");
        }
    }
}

