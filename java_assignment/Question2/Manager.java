// Manager class extending Employee
public class Manager extends Employee {

    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public double calculateTax() {
        return calculateSalary() * 0.25;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting.");
    }
}
