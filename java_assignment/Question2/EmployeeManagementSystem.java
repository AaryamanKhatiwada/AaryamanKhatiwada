// EmployeeManagementSystem.java
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create instances
        Manager mgr = new Manager("Alice", 101, 5000, 1000);
        Developer dev = new Developer("Bob", 102, 8000);
        Intern intern = new Intern("Charlie", 103, 8000);

        // Display Manager info
        System.out.println("\n----- Manager -----");
        mgr.displayInfo();
        System.out.println("Salary: " + mgr.calculateSalary());
        System.out.println("Tax: " + mgr.calculateTax());
        mgr.conductMeeting();

        // Display Developer info
        System.out.println("\n----- Developer -----");
        dev.displayInfo();
        System.out.println("Salary: " + dev.calculateSalary());
        System.out.println("Tax: " + dev.calculateTax());
        dev.writeCode();

        // Display Intern info
        System.out.println("\n----- Intern -----");
        intern.displayInfo();
        System.out.println("Salary: " + intern.calculateSalary());
        System.out.println("Tax: " + intern.calculateTax());
        intern.attendTraining();

        // Upcasting and Downcasting Demo
        System.out.println("\n----- Upcasting and Downcasting Demo -----");
        Employee emp1 = new Manager("David", 104, 6000, 1200); // Upcasting
        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        if (emp1 instanceof Manager) {
            Manager mgr2 = (Manager) emp1; // Downcasting
            mgr2.conductMeeting();
        }
    }
}
