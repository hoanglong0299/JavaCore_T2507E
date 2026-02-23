public class Tester extends Employee{
    public int bugsFound;

    public Tester (String id, String name, Double baseSalary,int bugsFound){
        super(id,name,baseSalary);
        this.bugsFound =bugsFound;
    }

    @Override
    public Double calculateSalary() {
        return this.getBaseSalary() + this.bugsFound * 30;
    }

    @Override
    public String getPosition() {
        return "Tester";
    }

    @Override
    public void showInfo() {

    }
}
