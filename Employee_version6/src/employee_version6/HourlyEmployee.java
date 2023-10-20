package employee_version6;

public class HourlyEmployee extends Employee{

    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, Name empName, float totalHoursWorked, float ratePerHour) {
        super(empID, empName);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    public HourlyEmployee(int empID, Name empName, DateFormat empDateHired, DateFormat empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {
        /*
        Computes the salary based on a weekly work hours (40 hours a week) (8 hours per day)
        Excess hours is overtime with 150% rate
        */
        float regHours;
        float overtimeHours;

        if(totalHoursWorked <= 40) {
            regHours = totalHoursWorked;
            overtimeHours = 0;
        } else {
            regHours = 40;
            overtimeHours = totalHoursWorked - 40;
        }

        double regSalary = regHours * ratePerHour;
        double overSalary = overtimeHours * (ratePerHour * 1.5);

        return regSalary + overSalary;
    }
    // displayInfo
    public void displayHourlyEmpInfo() {
        super.displayBasicInfo();
        System.out.println("Total Hours Worked: " + getTotalHoursWorked());
        System.out.println("Rate Per Hour: " + getRatePerHour());
        System.out.println("Salary: PHP " + computeSalary());
    }

    @Override
    public String toString() {
        return "\nTotal Hours Worked: " + totalHoursWorked +
                "\nRate Per Hour: " + ratePerHour +
                "\nSalary: PHP " + computeSalary();
    }
}