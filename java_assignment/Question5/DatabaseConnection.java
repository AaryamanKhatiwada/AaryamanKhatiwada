// DatabaseConnection.java
// Aaryaman Khatiwada
// Singleton Pattern – Database Connection

// Singleton class for managing a single instance of the database connection
public class DatabaseConnection {

    // Static variable to hold the single instance
    private static DatabaseConnection instance;

    // Private constructor to prevent external instantiation
    private DatabaseConnection() {
        System.out.println("Connecting to the database...");
    }

    // Static method to provide global access to the instance
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Create instance if not already created
        }
        return instance;
    }

    // Example method to simulate executing a database query
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
