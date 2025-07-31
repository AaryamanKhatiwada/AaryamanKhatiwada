// Intern is a subclass of Employee
public class Intern extends Employee {
    private double salary; // renamed from stipend to salary

    public Intern(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateTax() {
        return 0; // No tax for interns
    }

    public void attendTraining() {
        System.out.println(name + " is attending training.");
    }
}
