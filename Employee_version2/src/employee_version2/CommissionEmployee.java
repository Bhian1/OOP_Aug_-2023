/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_version2;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class CommissionEmployee extends Emp{
    private double totalSales;

    public CommissionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID,empName,empDateHired,empBirthDate);
        this.totalSales = totalSales;
    }
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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

        sb.append("Commission Worker Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee Name: ").append(getEmpName()).append("\n");
        sb.append("Date Hired: ").append(dateFormat.format(getEmpDateHired())).append("\n");
        sb.append("Birth Date: ").append(dateFormat.format(getBirthDate())).append("\n");
        sb.append("Total Sales: ").append(totalSales).append("\n");
        sb.append("Commission Rate: ").append((commissionRate * 100)).append("%").append("\n");
        sb.append("Salary: ").append(salary).append("\n");

        return sb.toString();
    }
}