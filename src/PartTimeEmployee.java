public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyRate;

    public PartTimeEmployee(String name, String employeeID, int hoursWorked, int hourlyRate) {
        super(name, employeeID, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return hourlyRate*hoursWorked;
    }
}
