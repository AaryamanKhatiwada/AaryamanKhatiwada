// Main.java  
public class Main {
    public static void main(String[] args) {
        // First call to getInstance() creates the instance
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");

        // Second call returns the same instance
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM orders");

        // Verify both references point to the same object
        System.out.println("Same instance? " + (db1 == db2));
    }
}
