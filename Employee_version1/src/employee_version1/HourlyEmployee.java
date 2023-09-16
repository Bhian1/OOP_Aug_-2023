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
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date birthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee(int empID, String empName, Date empDateHired, Date birthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public void printEmployeeDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Date Hired: " + dateFormat.format(empDateHired));
        System.out.println("Birth Date: " + dateFormat.format(birthDate));
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);

        float salary = totalHoursWorked * ratePerHour;
        System.out.println("Salary: " + salary);
    }
    
    @Override
    public String toString() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    StringBuilder sb = new StringBuilder();
    
    sb.append("Employee ID: ").append(empID).append("\n");
    sb.append("Employee Name: ").append(empName).append("\n");
    sb.append("Date Hired: ").append(dateFormat.format(empDateHired)).append("\n");
    sb.append("Birth Date: ").append(dateFormat.format(birthDate)).append("\n");
    sb.append("Total Hours Worked: ").append(totalHoursWorked).append("\n");
    sb.append("Rate Per Hour: ").append(ratePerHour).append("\n");
    
    float salary = totalHoursWorked * ratePerHour;
    sb.append("Salary: ").append(salary).append("\n");
    
    return sb.toString();
}
}

