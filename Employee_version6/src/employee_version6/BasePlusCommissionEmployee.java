package employee_version6;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, Name empName, Double totalSales, double baseSalary) {
        super(empID, empName, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, DateFormat empDateHired, DateFormat empBirthDate, Double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        double commissionSalary = super.computeSalary();
        return commissionSalary + baseSalary;
    }

    public void displayBCEInfo() {
        super.displayCommEmpInfo();
        System.out.println("Base Salary: PHP" + getBaseSalary());
    }

    @Override
    public String toString() {
        return "Base Salary: PHP" + getBaseSalary() + super.toString();
    }
}