package asm4.company;

public class FullTimeEmployee extends Employee {
    private Double fixedSalary;

    public FullTimeEmployee(String employeeId, String name, Double fixedSalary) {
        super(employeeId, name);
        this.fixedSalary = fixedSalary;

    }

    @Override
    public double getSalary() {
        return this.fixedSalary;
    }
}
