package asm4.company;

public class PartTimeEmployee extends Employee{
    private Double workHour;
    private Double hourPay;

    public PartTimeEmployee(String employeeId, String name, Double workHour,Double hourPay ){
        super(employeeId,name);
        this.workHour = workHour;
        this.hourPay = hourPay;
    }

    @Override
    public double getSalary() {
        return this.workHour * this.hourPay;
    }
}
