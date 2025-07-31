public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void display() {
        System.out.println("Bank Name: " + bankName);
        System.out.println();
    }
}
