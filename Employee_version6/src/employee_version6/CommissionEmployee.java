package employee_version6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommissionEmployee extends Employee{
    private Double totalSales;
    // Default Constructor
    public CommissionEmployee() {
    }
    // Basic info constructor
    public CommissionEmployee(int empID, Name empName, Double totalSales) {
        super(empID, empName);
        this.totalSales = totalSales;
    }
    // Full constructor
    public CommissionEmployee(int empID, Name empName, DateFormat empDateHired, DateFormat empBirthDate, Double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    // Getters
    public Double getTotalSales() {
        return totalSales;
    }
    // Setters
    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    // computeSalary method
    public double computeSalary() {
        // use totalSales
        // computes the salary base on adding the commission on sales plus the base salary
        /*
        * computes the salary based on commission,please refer to the table below:
            low sales       | 5%  | <50k
            typical sales	| 20% | >=50k but <100K
		                    | 30% | >=100k but <500k
            high sales	    | 50% | >=500k*/
        double baseSalary = 10000;

        if(totalSales < 50000) {
            return baseSalary + (totalSales * 0.05);
        } else if (totalSales >= 50000 && totalSales < 100000) {
            return baseSalary + (totalSales * .20);
        } else if (totalSales >= 100000 && totalSales < 500000) {
            return baseSalary + (totalSales * .30);
        } else {
            return baseSalary + (totalSales * 0.50);
        }
    }
    // private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    public void displayCommEmpInfo() {
        super.displayBasicInfo();
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("Salary: PHP " + computeSalary());
    }

    @Override
    public String toString() {
        return "\nTotal Sales: " + totalSales +
                "\nSalary: PHP " + computeSalary();
    }
}