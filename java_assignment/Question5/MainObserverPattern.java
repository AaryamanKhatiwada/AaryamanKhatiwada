// Observer Pattern - Order Status Tracking
// Aaryaman Khatiwada

import java.util.ArrayList;
import java.util.List;

// Observer interface that all observers must implement
interface Observer {
    void update(String status); // Called when the subject (Order) changes
}

// Subject (Observable) class
class Order {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void attach(Observer o) {
        observers.add(o);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}

// Concrete Observer: Customer
class Customer implements Observer {
    public void update(String status) {
        System.out.println("Customer notified: " + status);
    }
}

// Concrete Observer: Restaurant
class Restaurant implements Observer {
    public void update(String status) {
        System.out.println("Restaurant notified: " + status);
    }
}

// Concrete Observer: Delivery Agent
class DeliveryAgent implements Observer {
    public void update(String status) {
        System.out.println("Delivery agent notified: " + status);
    }
}

// Main class to run the example
public class MainObserverPattern {
    public static void main(String[] args) {
        // Create subject (Order)
        Order order = new Order();

        // Attach observers
        order.attach(new Customer());
        order.attach(new Restaurant());
        order.attach(new DeliveryAgent());

        // Change status and notify observers
        order.setStatus("Order confirmed");
        order.setStatus("Out for delivery");
    }
}
