public class Manager extends Employee implements BonusEligible{
    public int teamSize;

    public Manager (String id, String name, Double baseSalary,int teamSize){
        super(id,name,baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public Double calculateBonus() {
        return this.getBaseSalary() * 0.3;
    }

    @Override
    public Double calculateSalary() {
        return this.getBaseSalary() + this.teamSize *1000;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public void showInfo() {

    }
}
