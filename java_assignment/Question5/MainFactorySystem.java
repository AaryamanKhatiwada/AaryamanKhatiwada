// Factory Pattern Implementation  
// Aaryaman Khatiwada

// Common interface for all user types
interface User {
    void displayRole(); // Each role will define its own output
}

// Concrete class representing a Customer
class Customer implements User {
    public void displayRole() {
        System.out.println("I am a Customer. I can browse and order food.");
    }
}

// Concrete class representing a Delivery Agent
class DeliveryAgent implements User {
    public void displayRole() {
        System.out.println("I am a Delivery Agent. I deliver orders.");
    }
}

// Concrete class representing a Restaurant Owner
class RestaurantOwner implements User {
    public void displayRole() {
        System.out.println("I am a Restaurant Owner. I manage the menu and orders.");
    }
}

// Factory class to generate User objects based on role
class UserFactory {
    public static User createUser(String role) {
        switch (role.toUpperCase()) {
            case "CUSTOMER":
                return new Customer();
            case "DELIVERYAGENT":
                return new DeliveryAgent();
            case "RESTAURANTOWNER":
                return new RestaurantOwner();
            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}

// Main class to test Factory Pattern
public class MainFactorySystem {
    public static void main(String[] args) {
        User customer = UserFactory.createUser("Customer");
        User deliveryAgent = UserFactory.createUser("DeliveryAgent");
        User restaurantOwner = UserFactory.createUser("RestaurantOwner");

        customer.displayRole();
        deliveryAgent.displayRole();
        restaurantOwner.displayRole();
    }
}
