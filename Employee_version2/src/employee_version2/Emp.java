/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_version2;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Emp {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date birthDate;
    

    public Emp (int empID,String empName,Date empDateHired, Date birthDate ){
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.birthDate = birthDate;
    }
    public int getEmpID(){
        return empID;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public Date getEmpDateHired(){
        return empDateHired;
    }
    public void setEmpDateHired(Date empDateHired){
        this.empDateHired = empDateHired;
    }
    public Date getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
}