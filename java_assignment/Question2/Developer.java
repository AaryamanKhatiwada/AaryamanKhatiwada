// Developer is a subclass of Employee
public class Developer extends Employee {
    private double salary;

    public Developer(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateTax() {
        return salary * 0.20; // 20% tax
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}
