package week3.exercises;

public class Test {

    public static void main(String[] args) {
        System.out.println("Week 3 Lab exercises submitted by Anik Sen - 20-42138-1");
        Account obj = new Account("Anik Sen ", 42138 , 1000.0);
        System.out.println("\t\tInitial Banalance & Information\n");
        obj.showAccountDetails();
        obj.setCredit(5000.0);
        obj.setDebit(3000.0);
    }
}
