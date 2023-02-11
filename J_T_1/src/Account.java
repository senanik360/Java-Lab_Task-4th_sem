
public class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public void setAccountNumber(int an) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String ahn) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double b) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    void showDetails() {
        System.out.println(getAccountHolderName());
        System.out.println(getAccountNumber());
        System.out.println(getBalance());
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.setAccountHolderName("Nobonita");
        obj.setAccountNumber(999999);
        obj.setBalance(10234.42);
        obj.showDetails();
    }
}
