package employee_version4;

import java.util.Date;

public class Employee {
    private int empID;
    private Name empName;
    private DateFormat empDateHired; // date - month - year format
    private DateFormat empBirthDate; // date - month - year format

    public Employee() {
    }

    public Employee(int empID, Name empName, DateFormat empDateHired, DateFormat empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public DateFormat getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(DateFormat empDateHired) {
        this.empDateHired = empDateHired;
    }

    public DateFormat getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(DateFormat empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void displayBasicInfo() {
        System.out.println("Name: " + getEmpName().displayName());
        System.out.println("ID: " + getEmpID());
        System.out.println("Date Hired: "+ getEmpDateHired());
        System.out.println("Birth Date: " + getEmpBirthDate());
    }

    @Override
    public String toString() {
        return "Name: " + getEmpName() +
                "\nEmployee ID: " + getEmpID() +
                "\nDate Hired: " + getEmpDateHired() +
                "\nDate of Birth: " + getEmpBirthDate();
    }
}
