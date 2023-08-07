public class FullTimeEmployee extends Employee{
    private int bonus;

    public FullTimeEmployee(String name, String employeeID, double basicSalary, int bonus) {
        super(name, employeeID, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBasicSalary()+bonus;
    }
}
