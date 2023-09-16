/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_version1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void printCommissionEmployeeDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        double commissionRate = 0.0;
        
        if (totalSales < 50000) {
            commissionRate = 0.05;
        } else if (totalSales < 100000) {
            commissionRate = 0.20; 
        } else if (totalSales < 500000) {
            commissionRate = 0.30; 
        } else {
            commissionRate = 0.50;
        }

        double salary = totalSales * commissionRate;
        
        System.out.println("Commission Employee ID: " + empID);
        System.out.println("Commission Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Birth Date: " + dateFormat.format(empBirthDate));
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Salary: " + salary);
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        double commissionRate = 0.0;

        if (totalSales < 50000) {
            commissionRate = 0.05; 
        } else if (totalSales < 100000) {
            commissionRate = 0.20; 
        } else if (totalSales < 500000) {
            commissionRate = 0.30; 
        } else {
            commissionRate = 0.50; 
        }

        double salary = totalSales * commissionRate;

        StringBuilder sb = new StringBuilder();
        sb.append("Commission Employee ID: ").append(empID).append("\n");
        sb.append("Commission Employee Name: ").append(empName).append("\n");
        sb.append("Date Hired: ").append(dateFormat.format(empDateHired)).append("\n");
        sb.append("Birth Date: ").append(dateFormat.format(empBirthDate)).append("\n");
        sb.append("Total Sales: ").append(totalSales).append("\n");
        sb.append("Commission Rate: ").append((commissionRate * 100)).append("%").append("\n");
        sb.append("Salary: ").append(salary).append("\n");

        return sb.toString();
    }
}