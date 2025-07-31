public class Main {
    public static void main(String[] args) {
        Bank b = new Bank("Sanima Bank");
        b.display();

        Account account1 = new Account(50000, "7910");
        account1.deposit(10000);

        Account account2 = new Account(60000, "7911");
        account2.withdraw(10000);

        Customer c1 = new Customer("Aaryaman", "12345", account1);
        Customer c2 = new Customer("Ravan", "6789", account2);

        c1.display();
        c2.display();

        // Simulate object destruction
        account1 = null; // Dereference the object
        System.gc(); // Suggest JVM to run garbage collector (may trigger finalize)
    }
}
