package Bridgelabz.Package_Assignment;
import Bridgelabz.Package_Assignment.Problem_05.transaction;
import Bridgelabz.Package_Assignment.Problem_05.book;
import Bridgelabz.Package_Assignment.Problem_05.Member;
class MainApp {
    public static void main(String[] args) {
        book b = new book();
        b.addBook("Java Programming");
        Member m= new Member();
        m.addMember("Dipanshu");
        transaction t = new transaction();
        t.issue("Java Programming", "Dipanshu");
    }
}


