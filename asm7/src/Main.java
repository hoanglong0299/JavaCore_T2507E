import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Developer("001","Nguyễn Văn A",8000.0,12));
        employees.add(new Tester("002","Nguyễn Duy B",8500.0,20));
        employees.add(new Manager("003","Nguyễn Hoàng C",10000.0,3));

        double totalSalary = 0;
        double totalBonus = 0;
        System.out.println("Danh sách nhân viên");
        for (Employee e : employees){
            double salary = e.calculateSalary();
            double bonus = 0;

            System.out.print("ID: " + e.getId() + " | Tên: " + e.getName() + " | Chức vụ: " + e.getPosition());
            System.out.print(" | Lương: " + String.format("%,.0f", salary));

            if (e instanceof BonusEligible) {
                bonus = ((BonusEligible) e).calculateBonus();
                System.out.print(" | Thưởng: " + String.format("%,.0f", bonus));
            }

            System.out.println();

            // Cộng dồn tổng
            totalSalary += salary;
            totalBonus += bonus;
        }

        System.out.println("---------------------------");
        System.out.println("Tổng lương công ty phải trả: " + String.format("%,.0f", totalSalary));
        System.out.println("Tổng tiền thưởng: " + String.format("%,.0f", totalBonus));



    }


}
