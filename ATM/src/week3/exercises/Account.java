package week3.exercises;

public class Account {

    private String userName;
    private int userId;
    private double balance;
    public static String bankName = "Dutch Bangla";

    public Account(String userName, int userId, double balance) {
        this.userName = userName;
        this.userId = userId;
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance can not be zero or negative. ");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showAccountDetails() {

        System.out.println("\tAccount details : \n\nUser Name = " + userName + "\nUser Id = " + userId + "\nBankName : " + bankName + "\n" + getBalance());
    }

    public void setCredit(double newBalance) {
        if (newBalance > 0) {
            this.balance = this.balance + newBalance;
        } else {
            System.out.println("Balance can not be zero or negative. ");
        }
        System.out.println("Balance After Credit : " + balance);
    }

    public void setDebit(double amount) {
        if (amount > balance) {
            System.out.println("Withdrwail amount exceeded current banalce.!");
        }
        if (amount > 0) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("Balance can not be zero or negative. ");
        }
        System.out.println("Balance After Debit : " + balance);
    }
   
}
