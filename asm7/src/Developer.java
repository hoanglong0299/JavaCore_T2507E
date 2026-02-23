public class Developer extends  Employee implements  BonusEligible{
    public int overtimeHours;

    public Developer (String id,String name,Double baseSalary,int overtimeHours){
        super(id,name,baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public Double calculateSalary() {
        return this.getBaseSalary() + this.overtimeHours*50;
    }


    @Override
    public Double calculateBonus() {
        return this.getBaseSalary() *0.2;
    }

    @Override
    public String getPosition() {
        return "Developer";
    }

    @Override
    public void showInfo() {
        System.out.println("Mã nhân viên: "+getId() + "Tên nhân viên: "+getName());
    }
}
