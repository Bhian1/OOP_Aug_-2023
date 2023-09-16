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
public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
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

        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;

        StringBuilder sb = new StringBuilder();
        sb.append("Base Plus Commission Employee ID: ").append(empID).append("\n");
        sb.append("Base Plus Commission Employee Name: ").append(empName).append("\n");
        sb.append("Date Hired: ").append(dateFormat.format(empDateHired)).append("\n");
        sb.append("Birth Date: ").append(dateFormat.format(empBirthDate)).append("\n");
        sb.append("Total Sales: ").append(totalSales).append("\n");
        sb.append("Commission Rate: ").append((commissionRate * 100)).append("%").append("\n");
        sb.append("Base Salary: ").append(baseSalary).append("\n");
        sb.append("Total Earnings: ").append(totalEarnings).append("\n");

        return sb.toString();
    }

}
