public class Account {
    private String accountNumber;
    private double balance;

    public Account(double balance, String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber){
        this( 0.0, accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Amount cannot be deposited.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount successfully withdrawn: " + amount);
        } else {
            System.out.println("Amount cannot be withdrawn.");
        }
    }

    public void display() {
        System.out.println("This is the account number: " + accountNumber);
        System.out.println("This is the remaining balance: " + balance);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Account with number " + accountNumber + " is being destroyed.");
        super.finalize();
    }
}
