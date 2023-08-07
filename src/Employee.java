public class Employee {
    public String name;
    private String employeeID;
    private double basicSalary;

    public Employee(String name, String employeeID, double basicSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateMonthlySalary(){
        return basicSalary;
    }
}
