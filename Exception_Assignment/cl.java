package Bridgelabz.Exception_Assignment;import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) { super(msg); }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) { super(msg); }
}

class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) { super(msg); }
}

class Library {
    Map<String, Boolean> books = new HashMap<>();
    int borrowedBooks = 0;

    public Library() {
        books.put("Java", true);
        books.put("Python", true);
        books.put("DSA", false);
    }

    public void borrow(String book) throws BookNotAvailableException, UserLimitExceededException {
        if (borrowedBooks >= 5)
            throw new UserLimitExceededException("You cannot borrow more than 5 books!");

        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException("Book not available!");

        books.put(book, false);
        borrowedBooks++;
        System.out.println("Book borrowed: " + book);
    }

    public void returnBook(String book) throws InvalidReturnException {
        if (!books.containsKey(book) || books.get(book))
            throw new InvalidReturnException("This book was not borrowed!");

        books.put(book, true);
        borrowedBooks--;
        System.out.println("Book returned: " + book);
    }
}

public class cl {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrow("DSA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

