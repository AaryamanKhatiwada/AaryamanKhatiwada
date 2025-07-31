// Abstract Class Employee
public abstract class Employee implements TaxPayer {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Method to display employee details
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
